public class Goldfish extends Animal{
   /**
   *Overides the animal constructor
   *@param name The name of the goldfish
   */
   public Goldfish(String name){
      super(name);
   }
   /**
   *Overides the sound method
   *to play the sound a goldfish makes
   */
   @Override
   public void sound(){
      System.out.println("...");
   }
   /**
   *Overides the play method
   *to show the goldfishes favorite activity
   */
   @Override
   public void play(){
      System.out.println("The goldfish swims around the fish tank.");
   }
   public static void main(String [] args){
      Goldfish gold = new Goldfish("Josue");
      gold.sound();
      gold.play();
      gold.eat();
   }
}