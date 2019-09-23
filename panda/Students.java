public class Students
{
    private String name;
    private int grade;
    public Students(){
        this.name = null;
        this.grade = 0;
    }
    public Students(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    public int getGrade(){
        return this.grade;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "Name: "+this.name+", Grade: "+this.grade;
    }
}
