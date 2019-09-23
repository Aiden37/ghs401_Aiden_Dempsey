public class EcGrid
{
    //can only move right and down through 20x20 grid so 2 options for movement.
    //always moves a total of 40 points across the grid to get to the opposite corner with only 2 movement options
    public static void main(){
        int success = 0;
        int x = 0;
        int y = 20;
        for (int i = 0; i<40; i++){
            double turn = Math.random();
            if ((x<20 && y>0)){
                if (turn > 0.5){
                    y--;
                    System.out.println("down, y = " + y);
                }
                else{
                    x++;
                    System.out.println("right, x = " + x);
                }
            }
            else if (x==20){
                y--;
                System.out.println("down, y = " + y);
            }
            else {
                x++;
                System.out.println("right, x = " + x);
            }
        }
    }
}
