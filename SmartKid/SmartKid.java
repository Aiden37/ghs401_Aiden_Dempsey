public class SmartKid
{
    private double[] myGrades;
    
    public SmartKid(){
        myGrades=new double[]{0.0,0.0,0.0,0.0,0.0};
    }
    
    public SmartKid(double[] myGrades){
        this.myGrades=myGrades;
    }
    
    public double calcGPA(){
        double GPA = 0.0;
        for(int i=0; i<this.myGrades.length; i++){
            GPA += myGrades[i];
        }
        return GPA/this.myGrades.length;
    }
    
    public String toString(){
        String result="Grades are: ";
        
        for(int i=0; i < myGrades.length; i++){
            if(i==myGrades.length-1){
                result += this.myGrades[i];
            }
            else{
                result += this.myGrades[i] + ", ";
            }
        }
        return result;
    }
}
