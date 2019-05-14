package hu.johndoe.panda.gui.constants;

import java.awt.*;

public final class Strokes {

    private Strokes () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static final Stroke LevelEdgeStroke = new BasicStroke (
            1f,
            BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
            0f,
            new float[] {16f},
            0f
    );

    public static final Stroke AnimalEdgeStroke = new BasicStroke (
            4f,
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
    );

    public static final Stroke DefaultStroke = new BasicStroke ();

    public static final Stroke TileBreakStroke = new BasicStroke (
            8f,
            BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER
    );

}
