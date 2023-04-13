/**
* BlackBear Class
* Extends Animal.java
* @author Benjamin Breslich
*/

public class BlackBear extends Animal {
   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public BlackBear(String name){
      super(name);
   }
   
   /**
   * Prints a message for a black bear making a sound.
   */
   @Override
   public void sound(){
      System.out.println(this.name + " growls!");
   }
   
   /**
   * Prints a message for a black bear playing.
   */
   @Override
   public void play(){
      System.out.println(this.name + " climbs a tree.");
   }
   
   /**
   * Prints a message for a black bear eating.
   */
   @Override
   public void eat(){
      System.out.println(this.name + " eats some berries.");
   }
}