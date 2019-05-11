package hu.johndoe.panda.gui.util;

import hu.johndoe.panda.gui.constants.Errors;
import hu.johndoe.panda.gui.model.*;

import java.util.*;

public final class LevelGeneratorUtil {

    private static final String LOGTAG = "Level Generator Utility";

    private LevelGeneratorUtil () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    private static boolean isTopologicallySuitable (Level level) {

        Deque<Tile> bfsQueue = new ArrayDeque<> ();
        Set<Tile> bfsVisited = new HashSet<> ();

        bfsQueue.addLast (level.tiles.get (0));
        bfsVisited.addAll (bfsQueue);

        while (!bfsQueue.isEmpty ()) {

            Tile bfsCurrent = bfsQueue.removeFirst ();

            for (Tile neighbour : bfsCurrent.neighbours) {
                if (bfsVisited.add (neighbour)) {
                    bfsQueue.addLast (neighbour);
                }
            }

        }

        boolean ok = level.tiles.size () == bfsVisited.size ();

        ok &= level.tiles.stream ().noneMatch (t -> t.neighbours.size () < 2);

        return ok;

    }

    private static Item randomItem (Random random) {

        final int type = random.nextInt (4);

        switch (type) {
            case 0: return new GameMachine ();
            case 1: return new ChocolateVendingMachine ();
            case 2: return new Couch ();
            default: return new Wardrobe ();
        }

    }

    private static Animal randomPanda (Random random) {

        final int type = random.nextInt (3);

        switch (type) {
            case 0: return new CowardPanda ();
            case 1: return new JumpyPanda ();
            default: return new SleepyPanda ();
        }

    }

    public static void generate (Level level) {

        LogUtil.log (LOGTAG, "Generating new level");

        level.tiles.clear ();
        level.entranceTile = null;
        level.exitTile = null;

        Random random = new Random ();

        final int numNodes = 10 + random.nextInt (5);
        final int numItems = 1 + random.nextInt (3);
        final int numOrangutans = 1 + random.nextInt (3);
        final int numPandas = 2 + random.nextInt (5);
        final float fragileProbability = 0.3f;

        for (int i = 0; i < numNodes; i++) {

            Tile tile = new Tile ();
            tile.isFragile = random.nextFloat () < fragileProbability;
            level.tiles.add (tile);

        }

        while (!isTopologicallySuitable (level)) {

            boolean edgeAdded = false;

            do {

                int tileIndex1 = random.nextInt (level.tiles.size ());
                int tileIndex2 = random.nextInt (level.tiles.size ());

                if (tileIndex1 != tileIndex2) {

                    Tile tile1 = level.tiles.get (tileIndex1);
                    Tile tile2 = level.tiles.get (tileIndex2);

                    if (!tile1.neighbours.contains (tile2)) {

                        tile1.neighbours.add (tile2);
                        tile2.neighbours.add (tile1);
                        edgeAdded = true;

                    }

                }

            } while (!edgeAdded);

        }

        while (true) {

            int exitIndex = random.nextInt (level.tiles.size ());
            int entranceIndex = random.nextInt (level.tiles.size ());

            if (exitIndex != entranceIndex) {

                Tile exit = level.tiles.get (exitIndex);
                Tile entrance = level.tiles.get (entranceIndex);

                exit.isExit = true;
                level.exitTile = exit;
                level.entranceTile = entrance;

                break;

            }

        }

        for (int i = 0; i < numItems; i++) {

            boolean itemCreated = false;

            while (!itemCreated) {

                int tileIndex = random.nextInt (level.tiles.size ());
                Tile tile = level.tiles.get (tileIndex);

                if (tile.placedItem == null) {
                    tile.placedItem = randomItem (random);
                    itemCreated = true;
                }

            }

        }

        for (int i = 0; i < numOrangutans; i++) {

            boolean orangutanCreated = false;

            while (!orangutanCreated) {

                int tileIndex = random.nextInt (level.tiles.size ());
                Tile tile = level.tiles.get (tileIndex);

                if (tile.currentAnimal == null) {
                    Orangutan orangutan = new Orangutan ();
                    tile.currentAnimal = orangutan;
                    tile.currentAnimal.setStandingOn (tile);
                    level.animals.add (orangutan);
                    orangutanCreated = true;
                }

            }

        }

        for (int i = 0; i < numPandas; i++) {

            boolean pandaCreated = false;

            while (!pandaCreated) {

                int tileIndex = random.nextInt (level.tiles.size ());
                Tile tile = level.tiles.get (tileIndex);

                if (tile.currentAnimal == null) {
                    tile.currentAnimal = randomPanda (random);
                    tile.currentAnimal.setStandingOn (tile);
                    level.animals.add (tile.currentAnimal);
                    pandaCreated = true;
                }

            }

        }

    }

}
