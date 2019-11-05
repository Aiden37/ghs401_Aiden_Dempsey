
public class ArraySnake
{
    private int[] oneDArray;
    public ArraySnake(int[] arr){
        this.oneDArray = arr;
    }
    public int[][] horizontalSnake(int height, int width){
        int[][] twoDArray = new int[height][width];
        int row = 1;
        int arrayPart = 0;
        for(int i = 0;i<twoDArray.length;i++){
            if(row%2 == 1){
                for(int j = 0;j<twoDArray[i].length;j++){
                    if(oneDArray.length<=arrayPart){
                        twoDArray[i][j] = 0;
                    }
                    else{
                        twoDArray[i][j] = oneDArray[arrayPart];
                        arrayPart++;
                    }
                }
            }
            else{
                for(int j=twoDArray[i].length-1;j>-1;j--){
                    if(oneDArray.length<=arrayPart){
                        twoDArray[i][j] = 0;
                    }
                    else{
                        twoDArray[i][j] = oneDArray[arrayPart];
                        arrayPart++;
                    }
                }
            }
            row++;
        }
        return twoDArray;
    }
    public int[][] verticalSnake(int height, int width){
        int[][] twoDArray = new int[height][width];
        int row = 1;
        int arrayPart = 0;
        for(int i = 0;i<twoDArray[0].length;i++){
            if(row%2 == 1){
                for(int j = 0;j<twoDArray.length;j++){
                    if(oneDArray.length<=arrayPart){
                        twoDArray[j][i] = 0;
                    }
                    else{
                        twoDArray[j][i] = oneDArray[arrayPart];
                        arrayPart++;
                    }
                }
            }
            else{
                for(int j=twoDArray.length-1;j>-1;j--){
                    if(oneDArray.length<=arrayPart){
                        twoDArray[j][i] = 0;
                    }
                    else{
                        twoDArray[j][i] = oneDArray[arrayPart];
                        arrayPart++;
                    }
                }
            }
            row++;
        }
        return twoDArray;
    }
}
