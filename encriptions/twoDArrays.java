public class twoDArrays
{
    public static void main(){
        //String[][] matrix = new String[4][2]; //four rows two collumns
        String[][] matrix = new String[][]{{"grumpy","sleepy"},{"doc","happy"},{"bashful","dopey"},{"sneesy","Snow White"}}; 
        //matrix[0][0]="something" //changes 0, 0
        System.out.println(matrix.length);//grid has 4 rows, will print 4.
        System.out.println(matrix[0].length);//grid row 0 has 2 columns, will print 2.
        for(int r = 0; r<matrix.length;r++){
            for(int c=0; c<matrix[r].length;c++){
                System.out.print(matrix[r][c]+"\t");
            }
            System.out.println();
        }
    }
}
