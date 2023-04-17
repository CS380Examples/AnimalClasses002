/**
 * Bobcat Class that extends the abstract Animal class
 * @author Elijah Johnson
 */
 
public class Bobcat extends Animal {      
   
   /**
    * A constructor that takes in a name.
    * @param name Name of the animal.
    */
   public Bobcat(String name){
      super(name);
   }
   
   /**
    * Method that prints the sound a Bobcat makes.
    */
   @Override
   public void sound(){
      System.out.println(this.name + " screams and growls!");
   }
   
   
   /**
    * Method that prints what a Bobcat does for fun.
    */
   @Override
   public void play(){
      System.out.println(this.name + " bats around a ball of yarn!");
   }
   
   
   /**
    * Method that prints out what the Bobcat eats.
    */
   @Override
   public void eat(){
      System.out.println(this.name + " eats fresh meat!");
   }  
}