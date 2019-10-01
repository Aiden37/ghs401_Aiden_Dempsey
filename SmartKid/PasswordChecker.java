import javax.swing.JOptionPane;
public class PasswordChecker
{
    public static void main(){
        String state = "california";
        String city = "livermore";
        String sameState = JOptionPane.showInputDialog("What State Are You From?");
        String sameCity = JOptionPane.showInputDialog("What City Are You From?");
        sameState = sameState.toLowerCase();
        sameCity = sameCity.toLowerCase();
        int sta = state.compareTo(sameState);
        int cit = city.compareTo(sameCity);
        if(sta != 0 || cit != 0){
            if(sta<0){
                System.out.println("Your state is later in the alphabet.");
            }
            else if(sta>0){
                System.out.println("Your state is earlier in the alphabet.");
            }
            if(cit<0){
                System.out.println("Your city is later in the alphabet.");
            }
            else if(cit>0){
                System.out.println("Your city is earlier in the alphabet.");
            }
        }
        else{
            String password = "";
            boolean leng = false;
            boolean nonAlfNum = false;
            while(leng == false || nonAlfNum == false){
                password = JOptionPane.showInputDialog("Make a password.");
                if(password.length()>6){
                    leng = true;
                }
                else{
                    leng = false;
                }
                if(password.contains("+") || password.contains("-") || password.contains("*") || password.contains("@")){
                    nonAlfNum = true;
                }
                else{
                    nonAlfNum = false;
                }
            }
            System.out.println("Your password is "+password);
        }
    }
}
