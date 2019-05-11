package hu.johndoe.panda.gui.constants;

public final class Probabilities {

    private Probabilities () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static final float PandaMoveProbability = 1f / (60f * 4f);
    public static final float GameMachineClingProbability = 1f / (60f * 8f);
    public static final float ChocolateVendingMachineBeepProbability = 1f / (60f * 8f);

}
