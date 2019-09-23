public class NameDriver
{
    public static void main(){
        Students[] femaleStudents = new Students[7];
        Students[] maleStudents = new Students[7];
        String[] olderStudent = new String[7];
        
        maleStudents[0] = new Students();
        maleStudents[1] = new Students("Jim", 12);
        maleStudents[2] = new Students("Bob", 4);
        maleStudents[3] = new Students("Bill", 8);
        maleStudents[4] = new Students(null, 9);
        maleStudents[5] = new Students("Jeef", 0);
        maleStudents[6] = new Students("Shmee", 6);
        femaleStudents[0] = new Students();
        femaleStudents[1] = new Students("Jessie", 12);
        femaleStudents[2] = new Students("Susan", 10);
        femaleStudents[3] = new Students("Helen", 7);
        femaleStudents[4] = new Students("susie", 9);
        femaleStudents[5] = new Students("sally", 25);
        femaleStudents[6] = new Students(null, 0);
        for (int i = 0; i<maleStudents.length; i++){
            int fG = femaleStudents[i].getGrade();
            int mG = maleStudents[i].getGrade();
            String fN = femaleStudents[i].getName();
            String mN = maleStudents[i].getName();
            if (fN == null && mN == null){
                olderStudent[i] = new String("Space for Rent.");
            }
            else {
                if (mN == null){
                    olderStudent[i] = new String(fN);
                }
                else if (fN == null){
                    olderStudent[i] = new String(mN);
                }
                else {
                    if (fG>mG){
                        olderStudent[i] = new String(fN);
                    }
                    else if (mG>fG){
                        olderStudent[i] = new String(mN);
                    }
                    else{
                        if (Math.random()<0.5){
                            olderStudent[i] = new String(fN);
                        }
                        else{
                            olderStudent[i] = new String(mN);
                        }
                    }
                }
            }
        }
        System.out.println("Female Name and Grade: \t\t Male Name and Grade: \t\t Older Student:");
        for (int i = 0; i<maleStudents.length; i++){
            System.out.println(femaleStudents[i].toString() + " \t\t " + maleStudents[i].toString() + " \t\t " + olderStudent[i]);
        }
    }
}
