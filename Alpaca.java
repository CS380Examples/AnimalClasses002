public class Alpaca extends Animal {

    /**
     * A constructor that takes in a name.
     *
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


        System.out.println(this.name + " sound like   mmmaammmi  .");
    }

    public void play(){
        System.out.println(this.name + " plays soccer ball lol.");

}

    public void eat(){
        System.out.println(this.name + " eats some grains.");
    }



}
