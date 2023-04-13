/**
 * Peacock Class
 * Extends Animal.java
 * @author Tony Coraggio
 */

public class Peacock extends Animal {

   /**
    * A constructor method that takes in a name.
    * @param name Name of the animal.
    */
   public Peacock(String name) {
      super(name);
   }
   
   /**
    * A sound method that displays the noise a peacock makes.
    */
   @Override
   public void sound() {
      System.out.println(this.name + " makes the noise: 'SQUAHHHH!!'");
   }
   
   /**
    * A play method that displays how a peacock has fun.
    */
   @Override
   public void play() {
      System.out.println(this.name + " likes to flaunt their pretty feathers");
   }
}