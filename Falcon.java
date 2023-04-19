/**
*  Falcon class that extends Animal class
*  @author Jacob Thornton
*/

public class Falcon extends Animal {
   
   /**
   *  Constructor for Falcon object.
   *  @param name Name of the animal.
   */
   public Falcon(String name) {
      super(name);
   }
   
   /**
   *  Prints a message of the Falcon making a sound.
   */
   @Override
   public void sound() {
      System.out.println(this.name + " caws!");
   }
   
   /**
   *  Prints a message of the Falcon playing.
   */
   @Override
   public void play() {
      System.out.println(this.name + " flaps its wings!");
   }
   
   /**
   *  Prints a message of the Falcon eating.
   */
   @Override
   public void eat() {
      System.out.println(this.name + " eats some rodents!");
   }
}