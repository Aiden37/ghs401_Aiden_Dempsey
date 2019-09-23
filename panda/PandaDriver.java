public class PandaDriver
{
   public static void main(){
       Panda panda1 = new Panda("China", 832.78);
       
       double currentWeight = panda1.getWeight();
       
       currentWeight += 1000.0;
       panda1.setWeight(currentWeight);
       System.out.println(panda1.getWeight());
       
       //DataType name = new DataType
       Panda[] zoo = new Panda[3];
       zoo[0] = new Panda("USA", 311.2);
       zoo[1] = new Panda("Canada", 421.2);
       zoo[2] = new Panda("Mexico", 222.2);
       for (int i=0; i<zoo.length; i++){
           System.out.println(zoo[i]);
       }
   }
}
