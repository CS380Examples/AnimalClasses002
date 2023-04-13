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
   * Prints a message for an animal making a sound.
   */
   @Override
   public void sound(){
      System.out.println(this.name + " growls!");
   }
   
   /**
   * Prints a message for the animal playing.
   */
   @Override
   public void play(){
      System.out.println(this.name + " climbs a tree.");
   }
   
   /**
   * Prints a message for an animal eating.
   */
   @Override
   public void eat(){
      System.out.println(this.name + " eats some berries.");
   }
}