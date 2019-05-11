package hu.johndoe.panda.gui.constants;

public final class Probabilities {

    private Probabilities () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static final float PandaMoveProbability = 1f / (60f * 4f);

}
