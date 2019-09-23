import javax.swing.JOptionPane;
public class idk
{
    public static void main(){
        double hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("hours of sleep last night?"));
        while(hoursSleep < 0){
            hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("Impossible! Try again."));
        }
        System.out.println("You said "+ hoursSleep + " hours!");
    }
}
