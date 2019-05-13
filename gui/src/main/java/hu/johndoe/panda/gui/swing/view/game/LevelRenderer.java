package hu.johndoe.panda.gui.swing.view.game;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.model.Animal;
import hu.johndoe.panda.gui.model.Level;
import hu.johndoe.panda.gui.model.Tile;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public final class LevelRenderer {

    final Stroke levelEdgeStroke = new BasicStroke (
            1f,
            BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
            0f,
            new float[] {16f},
            0f
    );
    final Stroke animalEdgeStroke = new BasicStroke (
            4f,
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
    );
    final Stroke defaultStroke = new BasicStroke ();

    Set<String> visitedLevelEdges = new HashSet<> ();

    public void renderLevel (
            Level level,
            Graphics2D g,
            float delta
    ) {

        g.setColor (Colors.Tile);
        visitedLevelEdges.clear ();

        g.setStroke (levelEdgeStroke);

        for (Tile tile : level.tiles) {
            for (Tile neighbour : tile.neighbours) {

                String edgeId = tile.getId () < neighbour.getId ()
                        ? (tile.getId () + "-" + neighbour.getId ())
                        : (neighbour.getId () + "-" + tile.getId ());

                if (visitedLevelEdges.add (edgeId)) {

                    g.drawLine (
                            (int) (tile.getX () + Sizes.TileRadius),
                            (int) (tile.getY () + Sizes.TileRadius),
                            (int) (neighbour.getX () + Sizes.TileRadius),
                            (int) (neighbour.getY () + Sizes.TileRadius)
                    );

                }

            }
        }

        g.setStroke (animalEdgeStroke);

        for (Animal animal : level.animals) {

            if (animal.getGuidedAnimal () != null) {
                g.setColor (Colors.RedButtonBackground);
                g.drawLine (
                        (int) (animal.getX () + Sizes.AnimalSize / 2f),
                        (int) (animal.getY () + Sizes.AnimalSize / 2f),
                        (int) (animal.getGuidedAnimal ().getX () + Sizes.AnimalSize / 2f),
                        (int) (animal.getGuidedAnimal ().getY () + Sizes.AnimalSize / 2f)
                );
            }

        }

        for (Tile tile : level.tiles) {

            tile.draw (g, delta);

        }

        g.setStroke (defaultStroke);

    }

}
