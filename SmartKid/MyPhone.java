
public class MyPhone
{
    private String color;
    private int memoryCapacity;
    private Song[] songArray;
    public MyPhone(String color, int memory, Song s1, Song s2, Song s3){
        this.color = color;
        this.memoryCapacity = memory;
        songArray = new Song[3];
        this.songArray[0]=s1;
        this.songArray[1]=s2;
        this.songArray[2]=s3;
    }
    public MyPhone(String color, int memory, Song[] s1){
        this.color = color;
        this.memoryCapacity = memory;
        this.songArray=s1;
    }
    public int getTotalPlayTime(){
        int totalTime = 0;
        for(int i=0;i<songArray.length;i++){
            if(songArray[i]!= null){
                totalTime += songArray[i].getTime();
            }
        }
        return totalTime;
    }
    public void deleteAllSongs(){
        for(int i=0;i<songArray.length;i++){
            songArray[i] = null;
        }
    }
    public String  getTotalPlayTimeMinSec(){
        return (getTotalPlayTime() / 60)+" minutes, "+(getTotalPlayTime()%60)+" Seconds.";
    }
    public String printSongs(){
        String newString = "";
        for(int i=0;i<songArray.length;i++){
            if(songArray[i]!= null){
                newString += songArray[i].getTitle() + "\n";
            }
        }
        return newString;
    }
    public String toString(){
        return "Color: "+this.color+" \n"+"Memory Capacity: "+this.memoryCapacity+" \n"+"Song list: \n"+printSongs();
    }
}
