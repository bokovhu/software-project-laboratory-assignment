package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto._internal.Referencable;
import hu.johndoe.panda.proto.model.*;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.ShellPrintArgs;

import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ShellPrintCommandHandler implements CommandHandler<ShellPrintArgs> {

    private void printSection (PrintStream ps, String section) {
        ps.println ();
        ps.println ("[" + section + "]");
        ps.println ();
    }

    private void printTiles (PrintStream ps) {

        for (Tile tile : Game.getInstance ().level.getTiles ()) {

            ps.println (tile.toPrintableRepresentation ());

        }

    }

    private void printItems (PrintStream ps) {

        for (Tile tile : Game.getInstance ().level.getTiles ()) {

            if (tile.getPlacedItem () != null) {

                Item item = tile.getPlacedItem ();
                ps.println (item.toPrintableRepresentation ());

            }

        }

    }

    private void printAnimals (PrintStream ps) {

        for (Animal animal : Game.getInstance ().level.getAnimals ()) {

            ps.println (animal.toPrintableRepresentation ());

        }

    }

    private void printConnections (PrintStream ps) {

        Set <OrderIndependentPair <Integer>> visitedTileConnections = new HashSet<> ();

        for (Tile t : Game.getInstance ().level.getTiles ()) {

            if (t.getNeighbours () != null && !t.getNeighbours ().isEmpty ()) {

                for (Tile n : t.getNeighbours ()) {

                    OrderIndependentPair <Integer> oip = new OrderIndependentPair<> ();
                    oip.set (t.getId (), n.getId ());

                    if (visitedTileConnections.add (oip)) {
                        StringBuilder sb = new StringBuilder ();
                        sb.append ("TILE ").append (t.getId ()).append (" CONNECTED WITH TILE ").append (n.getId ());
                        ps.println (sb.toString ());
                    }

                }

            }

        }

        Set <OrderIndependentPair <Integer>> visitedWardrobeConnections = new HashSet<> ();

        for (Tile t : Game.getInstance ().level.getTiles ()) {

            // Hang me upside down from a telephone pole, I don't even care
            // instanceof is part of the Java language, and believe me when I tell you, that it is WIDELY used in the
            // industry
            // This is the ONLY part in the WHOLE CODE where we had to use it
            if (t.getPlacedItem () instanceof Wardrobe) {

                Wardrobe w = (Wardrobe) t.getPlacedItem ();
                if (w.getOtherWardrobe () != null) {

                    OrderIndependentPair <Integer> oip = new OrderIndependentPair<> ();
                    oip.set (w.getId (), w.getOtherWardrobe ().getId ());

                    if (visitedWardrobeConnections.add (oip)) {
                        StringBuilder sb = new StringBuilder ();
                        sb.append ("WARDROBE ").append (w.getId ())
                                .append (" CONNECTED WITH WARDROBE ").append (w.getOtherWardrobe ().getId ());
                        ps.println (sb.toString ());
                    }

                }

            }

        }

    }

    private void print (PrintStream ps) {

        printSection (ps, "TILES");
        printTiles (ps);

        printSection (ps, "ITEMS");
        printItems (ps);

        printSection (ps, "ANIMALS");
        printAnimals (ps);

        printSection (ps, "CONNECTIONS");
        printConnections (ps);

    }

    @Override
    public void handleCommand (ShellPrintArgs shellPrintArgs) {

        PrintStream pw = null;
        String filename = shellPrintArgs.filename == null
                ? ""
                : shellPrintArgs.filename.trim ();

        if (!filename.isEmpty ()) {
            if (filename.startsWith ("\"") && filename.endsWith ("\"")) {
                filename = filename.substring (1, filename.length () - 1);
            } else {
                throw new IllegalArgumentException ("Filenames should be between '\"' characters!");
            }
        }

        try {

            if (!filename.isEmpty ()) {
                pw = new PrintStream (new File (filename));
            } else {
                pw = System.out;
            }

            print (pw);

            if (!filename.isEmpty ()) {
                pw.close ();
            }

        } catch (Exception e) {
            e.printStackTrace ();
        }

    }

    private static final class OrderIndependentPair<T extends Comparable <T>> {

        private T a;
        private T b;

        public T getA () { return a; }
        public T getB () { return b; }

        public void set (T _a, T _b) {
            if (_a.compareTo (_b) < 0) {
                a = _a;
                b = _b;
            } else {
                a = _b;
                b = _a;
            }
        }

        @Override
        public boolean equals (Object obj) {
            if (obj instanceof OrderIndependentPair) {
                OrderIndependentPair<T> oip = (OrderIndependentPair<T>) obj;
                return (
                        Objects.equals (a, oip.a)
                                && Objects.equals (b, oip.b)
                ) || (
                        Objects.equals (a, oip.b)
                                && Objects.equals (b, oip.a)
                );
            }
            return false;
        }

        @Override
        public int hashCode () {
            return Objects.hash (a, b);
        }

    }

}
