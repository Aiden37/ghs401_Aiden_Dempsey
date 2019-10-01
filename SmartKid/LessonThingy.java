public class LessonThingy
{
    public static void main(){
        String school = "Granada High School";
        //prints from index 5 inclusive
        System.out.println(school.substring(5));
        //prints from index 8 (inclusive) to 12 (exclusive)
        System.out.println(school.substring(8,12));
        //prints out two letters at a time 
        for(int i=0; i<school.length()-1; i++){
            System.out.println(school.substring(i,i+2));
        }
    }
}
