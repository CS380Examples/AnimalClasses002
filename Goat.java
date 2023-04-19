/* Devin Irby, 31057141
/**
*  Class Goat that extends animal abstract class
*
*/
public class Goat extends Animal{
   
   public String name;
   
   public static void main(String args[]){
   
   Goat goat = new Goat("Lilly");
   
   goat.sound();
   goat.play();
   goat.eat();
   
   }
   /**
   *  Constructor using super's constructor
   *@param name Name of the animal
   *
   */
   public Goat(String name){
      super(name);
      this.name = name;
   }
   /**
   * Overridden method from superclass to display the sound
   * a goat makes
   */
   public void sound(){
      System.out.println("bahhhh");
   }
   /**
   * Overridden method from superclass to show how 
   * a goat plays
   */
   public void play(){
      System.out.println(name + " jumps over the fence");
   }

}