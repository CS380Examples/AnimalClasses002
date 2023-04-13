/**
* Eagle Class
* Extends Animal.java
* @author Diego Rios
*/

public class Eagle extends Animal {
   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Eagle(String name){
      super(name);
   }
   
   /**
   * Prints a message for a Eagle making a sound.
   */
   @Override
   public void sound(){
      System.out.println(this.name + " goes: KAWWWW!");
   }
   
   /**
   * Prints a message for a Eagle playing.
   */
   @Override
   public void play(){
      System.out.println(this.name + " likes to fly in the sky");
   }
   
   /**
   * Prints a message for a Eagle eating.
   */
   @Override
   public void eat(){
      System.out.println(this.name + " likes to eat fish");
   }
}