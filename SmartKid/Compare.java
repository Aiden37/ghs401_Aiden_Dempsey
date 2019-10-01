public class Compare
{
    public static void main(){
        String fruit1 = "pineapple";
        String fruit2 = "PiNeApPlE";
        System.out.println(fruit2);
        fruit2 = fruit2.toLowerCase();
        System.out.println(fruit2);
        System.out.println(fruit1.compareTo(fruit2));
        
        int num = 50;
        
        boolean run = true;
        
        //while(num>0){
            //System.out.println(num);
            //num-=5;
        //}
        while(run){
            System.out.println(num);
            num-=5;
            if(num==0){
                run = false;
            }
        }
    }
}
