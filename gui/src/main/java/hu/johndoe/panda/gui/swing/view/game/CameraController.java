package hu.johndoe.panda.gui.swing.view.game;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D;

public final class CameraController {

    private boolean panning = false;
    private float panStartX = 0f;
    private float panStartY = 0f;
    private float panStartCameraX = 0f;
    private float panStartCameraY = 0f;
    private float cameraX = 0f;
    private float cameraY = 0f;
    private float zoom = 1f;

    public void push (Graphics2D g) {

        g.translate (-cameraX, -cameraY);
        g.scale (zoom, zoom);

    }

    public void pop (Graphics2D g) {

        g.scale (1f / zoom, 1f / zoom);
        g.translate (cameraX, cameraY);

    }

    public Point2D.Float unproject (float x, float y) {

        AffineTransform transform = new AffineTransform ();
        transform.setToTranslation (-cameraX, -cameraY);
        transform.scale (zoom, zoom);
        Point2D.Float in = new Point2D.Float (x, y);
        Point2D.Float out = new Point2D.Float ();
        try {
            transform.inverseTransform (in, out);
        } catch (NoninvertibleTransformException e) {
            e.printStackTrace ();
        }
        return out;

    }

    public void handleMousePress (int button, float x, float y) {

        if (button == MouseEvent.BUTTON2 || button == MouseEvent.BUTTON3) {
            panning = true;
            panStartX = x;
            panStartY = y;
            panStartCameraX = cameraX;
            panStartCameraY = cameraY;
        }

    }

    public void handleMouseRelease (int button, float x, float y) {

        panning = false;

    }

    public void handleMouseDrag (float x, float y) {

        if (panning) {

            float dx = x - panStartX;
            float dy = y - panStartY;

            cameraX = panStartCameraX - dx;
            cameraY = panStartCameraY - dy;

        }

    }

}
