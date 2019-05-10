package hu.johndoe.panda.gui.util;

import hu.johndoe.panda.gui.constants.Errors;

public final class GeometryUtil {

    private GeometryUtil () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static boolean circleSegmentIntersects (
            float circleX, float circleY, float circleRadius,
            float segmentX1, float segmentY1, float segmentX2, float segmentY2
    ) {

        float baX = segmentX2 - segmentX1;
        float baY = segmentY2 - segmentY1;
        float caX = circleX - segmentX1;
        float caY = circleY - segmentY1;

        float a = baX * baX + baY * baY;
        float bBy2 = baX * caX + baY * caY;
        float c = caX * caX + caY * caY - circleRadius * circleRadius;

        float pBy2 = bBy2 / a;
        float q = c / a;

        float disc = pBy2 * pBy2 - q;
        return disc >= 0.0f;

    }

}
