import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Encription
{
    public static void main(){
        String phrase = JOptionPane.showInputDialog("please enter the phrase to encrypt:");
        int push = Integer.parseInt(JOptionPane.showInputDialog("how many letters forward?"));
        System.out.println(caesarEncrypt(phrase, push));
        String phrase2 = JOptionPane.showInputDialog("please enter the phrase to decrypt:");
        System.out.println(caesarDecrypt(phrase2, push));
    }
    public static String caesarEncrypt(String phrase, int push){
        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");
        alpha.add("e");
        alpha.add("f");
        alpha.add("g");
        alpha.add("h");
        alpha.add("i");
        alpha.add("j");
        alpha.add("k");
        alpha.add("l");
        alpha.add("m");
        alpha.add("n");
        alpha.add("o");
        alpha.add("p");
        alpha.add("q");
        alpha.add("r");
        alpha.add("s");
        alpha.add("t");
        alpha.add("u");
        alpha.add("v");
        alpha.add("w");
        alpha.add("x");
        alpha.add("y");
        alpha.add("z");
        
        String newPhrase = "";
        
        // iterate and isolate each letter in phrase
        for(int i=0; i<phrase.length();i++){
            String letter = phrase.substring(i,i+1); //pull each letter
            int spot = alpha.indexOf(letter); //find the index in the list
            if(spot == -1){
                newPhrase += phrase.substring(i,i+1); // adds the letter according to spot
            }
            else{
                spot+=push; // increase the index by the push value
                if(spot>alpha.size()-1){//checks for overflow
                    spot %= alpha.size();
                }
                newPhrase += alpha.get(spot); // adds the letter according to spot
            }
        }
        return newPhrase;
    }
    public static String caesarDecrypt(String phrase, int push){
        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");
        alpha.add("e");
        alpha.add("f");
        alpha.add("g");
        alpha.add("h");
        alpha.add("i");
        alpha.add("j");
        alpha.add("k");
        alpha.add("l");
        alpha.add("m");
        alpha.add("n");
        alpha.add("o");
        alpha.add("p");
        alpha.add("q");
        alpha.add("r");
        alpha.add("s");
        alpha.add("t");
        alpha.add("u");
        alpha.add("v");
        alpha.add("w");
        alpha.add("x");
        alpha.add("y");
        alpha.add("z");
        
        String newPhrase = "";
        
        // iterate and isolate each letter in phrase
        for(int i=0; i<phrase.length();i++){
            String letter = phrase.substring(i,i+1); //pull each letter
            int spot = alpha.indexOf(letter); //find the index in the list
            if(spot == -1){
                newPhrase += phrase.substring(i,i+1); // adds the letter according to spot
            }
            else{
                spot-=push; // increase the index by the push value
                if(spot<0){//checks for underflow
                    spot %= alpha.size();
                    spot = (alpha.size())+spot;
                    if(spot>alpha.size()-1){//checks for overflow
                        spot %= alpha.size();
                    }
                }
                newPhrase += alpha.get(spot); // adds the letter according to spot
            }
        }
        return newPhrase;
    }
}
