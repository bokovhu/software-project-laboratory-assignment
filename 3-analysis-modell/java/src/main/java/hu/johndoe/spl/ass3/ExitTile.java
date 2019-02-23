package hu.johndoe.spl.ass3;

public class ExitTile extends Tile {

    public Portal portal;

    @Override
    public boolean accept (Animal animal) {

        Animal current = animal.guidedAnimal;
        int score = 0;

        while (current != null) {

            // Should just remove the animal instead of killing it
            current.kill ();

            // Traverse the chain
            current = currentAnimal.guidedAnimal;

            // Increase points
            ++score;
        }

        // Teleport to other end of the portal
        this.portal.enter (animal);

        return true;

    }

}
