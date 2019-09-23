
import javax.swing.JOptionPane;
public class wheresWaldo
{
    public static void main(){
        String school = JOptionPane.showInputDialog("What is your school?");
        String[] characters = {"Molley Mach", null, "Darth Palagius the Wize", "waldo", "Kazuma"};
        if(school.equals("Granada")){
            String mascot = JOptionPane.showInputDialog("What is your mascot?");
            if(mascot.equals("Matadors")){
                ;
            }
            else{
                System.out.println("The mascot you entered is wrong!");
                main();
            }
        }
        else{
            System.out.println("The school you entered is wrong!");
            main();
        }
        for(int i=0; i<characters.length; i++){
            if(characters[i] != null){
                if (characters[i].equals("waldo")){
                    System.out.println("Theres the boy! waldo has been found!");
                }
                else{
                    System.out.println("Waldo isnt in spot "+i+", this is "+characters[i]+"!");
                }
            }
            else{
                System.out.println("Waldo isnt in spot "+i+", this spot is empty!");
            }
        }
        String fave = JOptionPane.showInputDialog("What is your favorite character?");
        if (fave.equals("Megumin")){
            System.out.println("We like the same character!");
        }
        else{
            System.out.println("We don't like the same character.");
        }
    }
}
