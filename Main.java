
import java.util.ArrayList;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.println("Hello World");

        //Ok so I need to  first find a way to prompt the user to give me their list of grades and stop when they are done

        while (true) { 
            System.out.println("Points");
            String finalGrade = scanner.nextLine();
             if (finalGrade.isEmpty()){
                break;
            }
            int finalgrades = Integer.valueOf(finalGrade);
           if(finalgrades<0 || finalgrades>100){
                System.out.println("Impossible number.");
            }else{
                grades.add(finalgrades);
            }
        }System.out.println(grades);
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;

        for (int i = 0; i< grades.size(); i++){
            int currentgrade = grades.get(i);
            if(currentgrade>=90 && currentgrade<=100 ){
                grade5++;
            }else if(currentgrade>=80 && currentgrade<=89 ){
                grade4++;
            }else if(currentgrade>=70 && currentgrade<=79 ){
                grade3++;
            }else if(currentgrade>=60 && currentgrade<=69 ){
                grade2++;
            }else if(currentgrade>=50 && currentgrade<=59 ){
                grade1++;
            }else if(currentgrade<50){
                grade0++;
            }
        }System.out.println(grade5 +" "+ grade4+" "+ grade3+" "+ grade2+" "+ grade1+" "+ grade0);
        while(grade5>0){
            System.out.print("*");
            grade5--;
            
        }System.out.println("");while(grade4>0){
            System.out.print("*");
            grade4--;
             
        }System.out.println("");while(grade3>0){
            System.out.print("*");
            grade3--;
             
        }System.out.println("");while(grade2>0){
            System.out.print("*");
            grade2--;
            
        }System.out.println("");while(grade1>0){
            System.out.print("*");
            grade1--;
             
        }System.out.println("");while(grade0>0){
            System.out.print("*");
            grade0--;
        }
    }   
}