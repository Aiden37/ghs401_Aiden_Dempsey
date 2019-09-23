public class Dog
{
   private String name;
   private String breed;
   private double weight;
   public Dog(){
       this.name = null;
       this.breed = null;
       this.weight = 0;
   }
   
   public Dog(String name, String breed, double weight){
       this.name = name;
       this.breed = breed;
       this.weight = weight;
   }
   
   //return type is a double
   public double getWeight(){
       return this.weight;
   }
   
   public String toString(){
       return "Name: " + this.name + ", Breed: " + this.breed + ", Weight: " + this.weight + "lbs.";
   }
}
