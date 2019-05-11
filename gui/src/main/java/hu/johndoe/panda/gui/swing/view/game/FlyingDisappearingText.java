package hu.johndoe.panda.gui.swing.view.game;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;

import java.awt.*;

public class FlyingDisappearingText extends GameEffect {

    private final float initialX, initialY;
    private final float velocityX, velocityY;
    private final String text;

    public FlyingDisappearingText (
            float initialX,
            float initialY,
            float velocityX,
            float velocityY,
            float lifespan,
            String text
    ) {
        super (lifespan);
        this.initialX = initialX;
        this.initialY = initialY;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.text = text;
    }

    @Override
    public void draw (Graphics2D g, float delta) {

        Composite beforeComposite = g.getComposite ();
        Composite newComposite = AlphaComposite.getInstance (
                AlphaComposite.SRC_OVER,
                1f - life / lifespan
        );
        g.setComposite (newComposite);

        g.setFont (Resources.GameFont32 ());

        // Shadow
        g.setColor (Colors.Shadow);
        g.drawString (
                text,
                (int) (initialX + velocityX * life + 4f), (int) (initialY + velocityY * life + 4f)
        );

        // Text
        g.setColor (Colors.TextLight);
        g.drawString (
                text,
                (int) (initialX + velocityX * life), (int) (initialY + velocityY * life)
        );

        g.setComposite (beforeComposite);

    }

}
