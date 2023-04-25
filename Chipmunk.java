/**
 * Chipmunk Class extends the abstract Animal class
 * @author Bishal Kshetri
 */
 
public class Chipmunk extends Animal {      
   
   /**
    * A constructor that takes in a name.
    * @param name Name of the animal.
    */
   public Chipmunk(String name){
      super(name);
   }
   
   /**
    * Method that prints the sound a Chipmunk makes.
    */
   @Override
   public void sound(){
      System.out.println(this.name + " does chucking when there is any threat.");
   }
   
   
   /**
    * Method that prints what a Chipmunk does for fun.
    */
   @Override
   public void play(){
      System.out.println(this.name + " plays around in the forest.");
   }
   
   
   /**
    * Method that prints out what the Chipmunk eats.
    */
   @Override
   public void eat(){
      System.out.println(this.name + " eats fruits and nuts.");
   }  
}