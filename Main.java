
import java.util.ArrayList;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.println("Hello World");

        //Ok so I need to  first find a way to prompt the user to give me their list of grades and stop when they are done
        int gradescore = 0;

        while (true) { 
            System.out.println("Points");
            String finalGrade = scanner.nextLine();
             if (finalGrade.isEmpty()){
                break;
            }
            int finalgrades = Integer.valueOf(finalGrade);
           if(finalgrades<0 || finalgrades>100){
                System.out.println("Impossible number.");
                continue;
            }
            if(finalgrades>=90 && finalgrades<=100 ){
                gradescore = 5;
            }else if(finalgrades>=80 && finalgrades<=89 ){
                gradescore = 4;
            }else if(finalgrades>=70 && finalgrades<=79 ){
                gradescore = 3;
            }else if(finalgrades>=60 && finalgrades<=69 ){
                gradescore = 2;
            }else if(finalgrades>=50 && finalgrades<=59 ){
                gradescore = 1;
            }else if(finalgrades<50 && finalgrades>=0){
                gradescore = 0;
            }
            grades.add(gradescore);
            System.out.println(grades);
    
        }
        int grade = 5; //sets initial value for grade
        while (grade>=0){ //this while loop will circle through all the grades possible from 0-5
            int stars = 0;//this controls the amount of stars that are printed. Created outside the for loop because otherwise it would reset the value of the stars everytime it moves to another value in the array list
            for(int i = 0; i<grades.size();i++){//cycles through the grades array list
                int received = grades.get(i);//assigns the index to an actual value so we can compare
                if(received == grade){//if the particular exam score corresponds to the number we are looking for like 5 for example it will add another star. basically keeps track of how many times a grade appears
                    stars++;//adds another star so again keeps track of how many times someone got over 90 for example
                }//we leave the if loop but stars still has the value that we iterated on in the if and for loop
            }System.out.println();
            System.out.print(grade+": ");// key point at this point the stars variable and the grade variable have not changed 
            while(stars>0){
                System.out.print("*");
                stars--;//stars is decremented so that we print only the correct amount
            }grade--;//grade is decremented so that we can move onto the next possible score
        }System.out.println("");


        
        
    }   
}