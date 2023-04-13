//Liam Barr
//Lab 3

 public class Shark extends Animal {
   
   /**
   * Constructor
   */
   public Shark (String n) {
      super(n);
   }
   
   /**
   * Makes a sound
   */
   public void sound() {
      System.out.println("You hear the unsettling music of the Jaws theme...");
   }
   
   /**
   * This shark can play
   */
   public void play() {
      System.out.println (name + " visits the Fish-Friendly Sharks Support Group");
   }
}