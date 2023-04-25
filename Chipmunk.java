public class Chipmunk extends Animal {      
   
   public Chipmunk(String name){
      super(name);
   }

   @Override
   public void sound(){
      System.out.println(this.name + " does chucking when there is any threat.");
   } 
}