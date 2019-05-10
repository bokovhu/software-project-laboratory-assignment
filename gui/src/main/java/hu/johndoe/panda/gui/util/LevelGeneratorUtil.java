package hu.johndoe.panda.gui.util;

import hu.johndoe.panda.gui.constants.Errors;
import hu.johndoe.panda.gui.model.Level;
import hu.johndoe.panda.gui.model.Tile;

import java.util.*;

public final class LevelGeneratorUtil {

    private static final String LOGTAG = "Level Generator Utility";

    private LevelGeneratorUtil () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    private static boolean isConnected (Level level) {

        Deque <Tile> bfsQueue = new ArrayDeque<> ();
        Set <Tile> bfsVisited = new HashSet<> ();

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

        return level.tiles.size () == bfsVisited.size ();

    }

    public static void generate (Level level) {

        LogUtil.log (LOGTAG, "Generating new level");

        level.tiles.clear ();
        level.entranceTile = null;
        level.exitTile = null;

        Random random = new Random ();

        final int numNodes = 10 + random.nextInt (5);
        final float fragileProbability = 0.3f;

        for (int i = 0; i < numNodes; i++) {

            Tile tile = new Tile ();
            tile.isFragile = random.nextFloat () < fragileProbability;
            level.tiles.add (tile);

        }

        while (!isConnected (level)) {

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

    }

}
