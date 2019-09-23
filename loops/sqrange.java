public class sqrange
{
    public static void main(){
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i<num.length; i++){
            int numsqu = num[i]*num[i];
            int numrand = (int)(Math.random()*((num[i]*num[i]+1)-num[i])+num[i]);
            if (numrand == num[i]){
                System.out.println((num[i])+ "      " + numsqu + "     " + numrand + "      This random value is equal to the initial value.");
            }
            else{
                if(numrand == numsqu){
                    System.out.println((num[i])+ "      " + numsqu + "     " + numrand + "      This random value is equal to the square of the initial value.");
                }
                else{
                    System.out.println((num[i])+ "      " + numsqu + "     " + numrand);
                }
            }
        }
        String[] movies = {"Monty Python and the Holy Grail", "Star Wars", "The Princess Bride"};
        String[] songs = {"Enter Sandman", "Crazy Train", "Back in Black"};
        
        for (int i = 0; i < movies.length; i++)
        {
            if (movies.length-i != 1)
            {
                System.out.println(movies[i] + ", ");
            }
            else
            {
                System.out.println(movies[i] + ".");
            }
        }
        int loop = 0;
        while (loop < songs.length)
        {
            System.out.print(songs[loop]);
            loop++;
            if (loop < songs.length){
                System.out.print(", ");
            }
            
        }
    }
}