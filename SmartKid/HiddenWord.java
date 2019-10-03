public class HiddenWord
{
    private String word;
    public HiddenWord(String word){
        this.word = word;
    }
    public String getHint(String hint){
        String nWord = "";
        if(hint.equals(this.word)){nWord = this.word;}
        else{
            for(int i=0;i<hint.length();i++){
                if(this.word.substring(i,i+1).equals(hint.substring(i,i+1))){nWord+=hint.substring(i,i+1);}
                else if(this.word.contains(hint.substring(i,i+1))){nWord+="+";}
                else{nWord+="*";}
            }
        }
        return nWord;
    }
    public String toString(){
        return this.word;
    }
}
