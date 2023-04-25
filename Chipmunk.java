public class Chipmunk extends Animal {      
   
   public Chipmunk(String name){
      super(name);
   }

   @Override
   public void sound(){
      System.out.println(this.name + " does chucking when there is any threat.");
   } 
   
   @Override
   public void play(){
      System.out.println(this.name + " plays around in the forest.");
   }
   
   @Override
   public void eat(){
      System.out.println(this.name + " eats fruits and nuts.");
   } 
}