/**
 * Alpaca class ettends the Animal Class
 * @author Issa
 */

public class Alpaca extends Animal {

    /**
     * A constructor that takes in a name.
     * @param name Name of the animal.
     */
    public Alpaca(String name) {
        super(name);
    }

    /**
     * Abstract method that should represent a specific sound
     * an animal makes.
     */
    @Override

    public void sound() {
        // print how Alpaca sounds like
        System.out.println(this.name + " sound like   mmmaammmi  .");}

    /**
     * Abstract method that should represent a specific sound
     *   an animal makes
     */
    public void play(){
        // print what Alpaca plays.
        System.out.println(this.name + " plays soccer ball lol.");
    }
    /**
     * Abstract method that should represent a specific sound
     *   an animal makes
     */
    public void eat(){
        // print what Alpaca eats
        System.out.println(this.name + " eats some grains.");
    }



}
