import java.util.ArrayList;
public class SubstringAndForEach
{
    public static void main(){
        String[] cereals = {"Honey Nut Cheerios", "Kashi", "Granola", "Special K"};
        //array list of strings called animals
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("lizard");
        animals.add("liger");
        animals.add("sea monkeys");
        animals.add("prairie dog");
        
        //foreach loop, cant remove things but it is fast at printing lists...
        for(String c: cereals){
            c = null;
        }
        for(String c: cereals){
            System.out.println(c);
        }
        
        for(String currAnimal: animals){
            System.out.println(currAnimal);
        }
    }
}
