public class Ladybug extends Animal{
	/**
	 * Constructor for the Ladybug class
	 * @param name The name of the ladybug.
	 */
	public Ladybug(String name) {
		super(name);
	}
	/**
	 * Overrides the sound method
	 */
	@Override
	public void sound() {
		System.out.println("*Ladybug noises*");
	}
	/**
	 * Overrides the play method
	 */
	@Override
	public void play() {
		System.out.println("The Ladybug flies around.");
	}
	
}
