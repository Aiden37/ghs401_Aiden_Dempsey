import java.util.ArrayList;
public class ArrayListStuff
{
    public static void main(){
        ArrayList<String> stateList = new ArrayList<String>();
        stateList.add("California");
        stateList.add("Nevada");
        stateList.add("Alaska");
        stateList.add("Oregon");
        stateList.add("Arizona");
        for(int i=0;i<stateList.size();i++){
            System.out.println(stateList.get(i));
        }
        System.out.println("Messin with the array list... \n");
        //stateList.add(1, "Arkansas"); // adds Arkansas
        //stateList.remove(5); //removes Arizona
        //stateList.set(4, "Rhode Island"); // replaces oregon with Rhode Island
        for(int i=0;i<stateList.size();i++){
            if(stateList.get(i).contains("a")){
                stateList.remove(i);// does not work alone as when a peice is removed everything falls back an index value
                i--;//alternatively, flip the program and remove from the top of the array (int i =stateList.size()-1)...etc
            }
        }
        for(int i=0;i<stateList.size();i++){
            System.out.println(stateList.get(i));
        }
    }
}
