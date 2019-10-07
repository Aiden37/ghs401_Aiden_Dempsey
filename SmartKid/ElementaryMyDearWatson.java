import java.util.ArrayList;
public class ElementaryMyDearWatson
{
    public static void main(){
        ArrayList<String> elementList = new ArrayList<String>();
        elementList.add("argon");
        elementList.add("boron");
        elementList.add("carbon");
        elementList.add("flourine");
        elementList.add("gold");
        elementList.add("iron");
        elementList.add("livermorium");
        System.out.println("here are the elements:");
        for(int i=0;i<elementList.size();i++){
            System.out.println(elementList.get(i));
        }
        elementList.add(1, "bismuth");
        elementList.set(3, "cobalt");
        System.out.println("here are the elements, with some changes:");
        for(int i=0;i<elementList.size();i++){
            System.out.println(elementList.get(i));
        }
        System.out.println("The elements containing 'on' are...");
        for(int i=0;i<elementList.size();i++){
            if(elementList.get(i).contains("on")){
                System.out.println(elementList.get(i));
            }
        }
        System.out.println("Removing all the elements after the letter 'd'.");
        for(int i=0;i<elementList.size();i++){
            if(elementList.get(i).compareTo("d")>0){
                elementList.remove(i);
                i--;
            }
        }
        for(int i=0;i<elementList.size();i++){
            System.out.println("Still remaining: "+elementList.get(i));
        }
    }
}
