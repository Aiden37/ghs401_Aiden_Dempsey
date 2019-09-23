import javax.swing.JOptionPane;
public class greatestOfAllTime{
    public static void main(){
        double size = Double.parseDouble(JOptionPane.showInputDialog("How big would you like your array?"));
        while(size<10||size>10000){
            size = Double.parseDouble(JOptionPane.showInputDialog("Unacceptable, choose something else!"));
        }
        //https://www.baeldung.com/java-initialize-array
        long rand[] = new long[(int)size];
        for (int i = 0;i<rand.length;i++){
            int num = (int)(Math.random()*5+20);
            rand[i] = num;
        }
        for (int i = 0; i<rand.length;i++){
            System.out.print(rand[i]+" ");
        }
        System.out.println();
        long great=0;
        long least=100;
        for (int i = 0; i<rand.length;i++){
            if(rand[i]>great){
                great = rand[i];
            }
            if(rand[i]<least){
                least = rand[i];
            }
        }
        System.out.println("Greatest: "+ great);
        System.out.println("Least: "+ least);
    }
}
