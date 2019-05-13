package hu.johndoe.panda.gui.swing.view.game;

import hu.johndoe.panda.gui.model.Drawable;
import hu.johndoe.panda.gui.model.Updatable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public final class GameEffects implements Drawable, Updatable {

    private static final String LOGTAG = "Game Effects";

    private static final GameEffects INSTANCE = new GameEffects ();

    private List <GameEffect> effects = new ArrayList<> ();
    private List <GameEffect> effectsToRemove = new ArrayList<> ();

    private GameEffects () {

    }

    public static GameEffects getInstance () {
        return INSTANCE;
    }

    public void addFlyingDisappearingText (
            String text,
            float x, float y, float vx, float vy,
            float lifespan
    ) {

        effects.add (
                new FlyingDisappearingText (
                        x, y, vx, vy,
                        lifespan,
                        text
                )
        );

    }

    @Override
    public void draw (Graphics2D g, float delta) {

        for (GameEffect ge : effects) {
            ge.draw (g, delta);
        }

    }

    @Override
    public void update (float delta) {

        effectsToRemove.clear ();

        for (GameEffect ge : effects) {
            ge.update (delta);
            if (!ge.isAlive ()) {
                effectsToRemove.add (ge);
            }
        }

        effects.removeAll (effectsToRemove);

    }

}
