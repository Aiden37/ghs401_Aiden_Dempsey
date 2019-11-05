public class Driver
{
   public static void main(){
       int[] arr = new int[33];
       int count = 1;
       for(int i=0; i<arr.length; i++){
           
           arr[i] = count;
           count++;
           
           
        }
        
        ArraySnake snake1 = new ArraySnake(arr);
        
        int[][] snakedArray1 = snake1.horizontalSnake(5,7);
       
        System.out.println("Now printing the horizontal snaked array...");
        for(int r=0; r < snakedArray1.length; r++){
            
            for(int c = 0; c < snakedArray1[0].length; c++){
                
                System.out.print(snakedArray1[r][c] + "\t");
                
            }
            
            System.out.println();
            
        }
        
        
        
        
        System.out.println("\n\nNow printing the vertical snaked array...");
        int[][] snakedArray2 = snake1.verticalSnake(6,10);
       
        for(int r=0; r < snakedArray2.length; r++){
            
            for(int c = 0; c < snakedArray2[0].length; c++){
                
                System.out.print(snakedArray2[r][c] + "\t");
                
            }
            
            System.out.println();
            
        }
    }
}