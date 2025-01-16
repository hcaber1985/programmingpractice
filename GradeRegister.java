import java.util.ArrayList;

public class GradeRegister{
    private ArrayList<Integer> grades;

    public GradeRegister(){
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points){
        int gradescore = 0;

        if(points>=90 && points<=100 ){
            gradescore = 5;
        }else if(points>=80 && points<=89 ){
            gradescore = 4;
        }else if(points>=70 && points<=79 ){
            gradescore = 3;
        }else if(points>=60 && points<=69 ){
            gradescore = 2;
        }else if(points>=50 && points<=59 ){
            gradescore = 1;
        }else if(points<50 && points>=0){
            gradescore = 0;
        }
        grades.add(gradescore);
        System.out.println(grades);
    }
    public int numberOfGrades(int grade){  //sets initial value for grade
        int stars = 0;//this controls the amount of stars that are printed. Created outside the for loop because otherwise it would reset the value of the stars everytime it moves to another value in the array list
            for(int i = 0; i<grades.size();i++){//cycles through the grades array list
                int received = grades.get(i);//assigns the index to an actual value so we can compare
                if(received == grade){//if the particular exam score corresponds to the number we are looking for like 5 for example it will add another star. basically keeps track of how many times a grade appears
                    stars++;//adds another star so again keeps track of how many times someone got over 90 for example
                }//we leave the if loop but stars still has the value that we iterated on in the if and for loop
                
            }grade--;
        return stars;
    }
}