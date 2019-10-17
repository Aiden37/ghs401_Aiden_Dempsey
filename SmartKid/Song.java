
public class Song
{
    private String title;
    private int length;
    public Song(String title, int time){
        this.title = title;
        this.length = time;
    }
    public int getTime(){
        return this.length;
    }
    public String getTitle(){
        return this.title;
    }
}
