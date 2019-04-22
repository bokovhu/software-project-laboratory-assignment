package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Animal;
import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Item;
import hu.johndoe.panda.proto.model.Tile;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.ShellPrintArgs;

import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ShellPrintCommandHandler implements CommandHandler<ShellPrintArgs> {

    private String animalReference (Animal animal) {

        if (animal == null) {
            return "(NULL)";
        }
        return "()";

    }

    private String itemReference (Item item) {

        if (item == null) {
            return "(NULL)";
        }
        return "()";

    }

    private void print (PrintStream ps) {

        ps.println ("[TILES]");
        ps.println ();

        for (Tile tile : Game.getInstance ().level.getTiles ()) {

            StringBuilder sb = new StringBuilder ();

            if (tile.isFragile) {
                sb.append ("FRAGILE ");
            }

            if (tile.isExit) {
                sb.append ("EXIT ");
            }

            if (tile.equals (Game.getInstance ().level.getStartTile ())) {
                sb.append ("START ");
            }

            sb.append ("TILE ")
                    .append ("ID = ").append (tile.getId ()).append (" ")
                    .append ("CURRENTANIMAL = ").append (animalReference (tile.getCurrentAnimal ())).append (" ")
                    .append ("CURRENTITEM = ").append (itemReference (tile.getPlacedItem ()));

            ps.println (sb.toString ());

        }

        ps.println ();
        ps.println ("[CONNECTIONS]");
        ps.println ();

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
