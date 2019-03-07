package hu.johndoe.spl.ass3;

public abstract class Animal implements Updatable {

   private Tile standingOn;
   private Animal leaderAnimal;
   private Animal guidedAnimal;

   public void collideWithAnimal(Animal animal){}
   public void collideWithPanda(Animal panda){}
   public void collideWithOrangutan(Animal orangutan){}
   public void kill(){}
   public void startLeading(Animal leader){}
   public void stopLeading(){}
   public void moveTo(Tile targetTile){}
   public void use(Item item){}
   public void update(){}
   public void goToSleep(Tile where){}
   public void jump(){}
   public void scare(){}
   public void leadOut(){}




}
