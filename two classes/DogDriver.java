public class DogDriver
{
   public static void main(){
       Dog d1 = new Dog();
       System.out.println(d1.toString());
       Dog d2 = new Dog("Shmee", "Border Collie", 273.5);
       System.out.println(d2.toString());
       System.out.println(d1.getWeight());
   }
}
