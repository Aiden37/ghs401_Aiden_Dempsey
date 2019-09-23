
public class Loops
{
   public static void main(){
       String[] firstNames = {"Ronald", "Donald", "Bonald", "Wonald", "Monald"};
       String[] lastNames = {"Reagan", "Duck", "Beansly", "Frankers", "McTronald"};
       System.out.println("First Name       Last Name");
       int num;
       int num1;
       for(int i=0;i<10;i++){
           num = (int)(Math.random()*firstNames.length);
           num1 = (int)(Math.random()*lastNames.length);
           System.out.println(firstNames[num]+"           "+lastNames[num1]);
        }
       int a=4;
       //to print 0-19 with a starting at 0
       //while(a<20){
           //System.out.println(a);
           //a++;
       //}
       //to print 93-81 with a starting at 93
       //while(a>=81){
           //System.out.println(a);
           //a--;
        //}
        //printing names from 4-0
       while(a>=0){
           System.out.println(firstNames[a]);
           a--;
        }
    }
}
