

public class Wolf extends Animal {
	
	/**
	 * A field which stores the animals name.
	 */
	public Wolf(String name) {
		super(name);
		
	}
	
	@Override
	/**
    *Abstract method that should represent a specific sound
    * an animal makes. 
    */
   public  void sound() {
		System.out.println(this.name + "Awoooooo");
	}
   
   
   /**
    * Abstract method that should represent a specific  activity
    * that an animal does for fun.
    */
   public  void play() {
		System.out.println(this.name + "roll around the grass");

   }
   
   
   /**
    * A  method that prints out that the animal is eating food.
    */
   public void eat(){
      System.out.println(this.name + "eats a deer");
   }
}
