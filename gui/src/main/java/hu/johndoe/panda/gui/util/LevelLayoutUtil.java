package hu.johndoe.panda.gui.util;

import hu.johndoe.panda.gui.constants.Errors;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.model.Level;
import hu.johndoe.panda.gui.model.Tile;

import java.util.Random;

public final class LevelLayoutUtil {

    private static final String LOGTAG = "Level Layout Utility";

    private LevelLayoutUtil () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static void generateLayout (Level level) {

        LogUtil.log (LOGTAG, "Generating level layout");

        Random random = new Random ();

        final float tileCircleRadius = Sizes.TileRadius;
        final float minDistanceBetweenTiles = tileCircleRadius * 2f;
        final float minDistanceBetweenNodesAndEdges = Sizes.TileRadius * 1.5f;

        final float xLowerBound = 0f;
        final float yLowerBound = 0f;

        final float xUpperBound = (float) level.tiles.size () * minDistanceBetweenTiles * 1.8f;
        final float yUpperBound = (float) level.tiles.size () * minDistanceBetweenTiles * 1.8f;

        while (true) {

            // Generate random layout
            for (Tile tile : level.tiles) {

                tile.setX (random.nextFloat () * (xUpperBound - xLowerBound) + xLowerBound);
                tile.setY (random.nextFloat () * (yUpperBound - yLowerBound) + yLowerBound);

            }

            // Check if layout is OK
            boolean layoutOk = true;

            for (Tile tile : level.tiles) {

                if (!layoutOk) break;

                for (Tile anotherTile : level.tiles) {

                    if (tile.equals (anotherTile)) continue;

                    float dx = tile.getX () - anotherTile.getX ();
                    float dy = tile.getY () - anotherTile.getY ();

                    float distance = (float) Math.sqrt (dx * dx + dy * dy);

                    if (distance < minDistanceBetweenTiles) {
                        layoutOk = false;
                        break;
                    }

                }

            }

            // Check for line-circle intersection between nodes and edges
            if (layoutOk) {

                for (Tile tile : level.tiles) {
                    if (!layoutOk) break;
                    for (Tile neighbour : tile.neighbours) {
                        if (!layoutOk) break;
                        for (Tile thirdTile : level.tiles) {

                            if (tile.equals (thirdTile)) continue;
                            if (neighbour.equals (thirdTile)) continue;

                            boolean intersectionResult = GeometryUtil.circleSegmentIntersects (
                                    thirdTile.getX () + Sizes.TileRadius, thirdTile.getY () + Sizes.TileRadius, Sizes.TileRadius,
                                    (tile.getX () + Sizes.TileRadius), (tile.getY () + Sizes.TileRadius),
                                    (neighbour.getX () + Sizes.TileRadius), (neighbour.getY () + Sizes.TileRadius)
                            );

                            if (intersectionResult) {
                                layoutOk = false;
                                break;
                            }

                            float lineDistance = GeometryUtil.pointSegmentDistance (
                                    thirdTile.getX () + Sizes.TileRadius, thirdTile.getY () + Sizes.TileRadius,
                                    (tile.getX () + Sizes.TileRadius), (tile.getY () + Sizes.TileRadius),
                                    (neighbour.getX () + Sizes.TileRadius), (neighbour.getY () + Sizes.TileRadius)
                            );

                            if (lineDistance < minDistanceBetweenNodesAndEdges) {
                                layoutOk = false;
                                break;
                            }

                        }
                    }
                }

            }

            if (layoutOk) break;

        }

    }

}
