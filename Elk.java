/**
 *Elk class that extends animal
 *@author Jesus Rodriguez
 */
public class Elk extends Animal{

/**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Elk(String name){
      super(name);
   }
   /**
    *Abstract method that should represent a specific sound
    * an animal makes.
    */
   @Override
   public void sound(){
      System.out.println(this.name + "loud wailing bugle");
   }
 /**
    * Abstract method that should represent a specific  activity
    * that an animal does for fun.
    */
   @Override
   public void play(){
      System.out.println(this.name + "sleeps most of the day");
   }
 /**
    * A  method that prints out that the animal is eating food.
    */
   public void eat(){
      System.out.println(this.name + " eats mushrooms.");
   }




}