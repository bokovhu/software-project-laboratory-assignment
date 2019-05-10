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

    public static float pointSegmentDistance (
            float pointX, float pointY,
            float segmentX1, float segmentY1, float segmentX2, float segmentY2
    ) {

        float ab = distance (pointX, pointY, segmentX1, segmentY1);
        float bc = distance (segmentX1, segmentY1, segmentX2, segmentY2);
        float ac = distance (pointX, pointY, segmentX2, segmentY2);

        float s = (ab + bc + ac) / 2f;
        float area = (float) Math.sqrt (s * (s - ab) * (s - bc) * (s - ac));
        return (2.0f * area) / bc;

    }

    public static float distance (
            float x1, float y1,
            float x2, float y2
    ) {

        float dx = x1 - x2;
        float dy = y1 - y2;

        return (float) Math.sqrt (dx * dx + dy * dy);

    }

}
