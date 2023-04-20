/***
 * A class that extends the Animal class.
 * @author Hunter Lawrence
 */
public class Duck extends Animal
{
   /***
    * A constructor that calls the super constructor.
    * @param name The name to be assigned to this instance of Duck.
    */
   public Duck(String name)
   {
      super(name);
   }

   /***
    * A method that prints out a Duck's prefered method of play.
    */
   @Override
   public void play()
   {
      System.out.println(name + ", the duck, swimms then takes flight.");
   }

   /***
    * A method that prints out a Duck's sound.
    */
   @Override
   public void sound()
   {
      System.out.println(name + ": *Quack*");
   }
   
}