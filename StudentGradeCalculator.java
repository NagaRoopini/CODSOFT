
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numsubjects=sc.nextInt();
        int totalmarks=0;
        for(int i=1;i<=numsubjects;i++){
            System.out.println("Enter marks for subject "+i+" (out of 100)");
            int marks=sc.nextInt();
            totalmarks+=marks;
        }
        double averagepercent=(double)totalmarks/numsubjects;
        char grade;
        if(averagepercent>=90){
            grade='A';
        }
        else if(averagepercent>=80){
            grade='B';
        }
        else if(averagepercent>=70){
            grade='C';
        }
        else if(averagepercent>=60){
            grade='D';
        }
        else if(averagepercent>=50){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Total marks: "+totalmarks);
        System.out.println("Average percentage: "+averagepercent);
        System.out.println("Grade: "+grade);
        sc.close();
    }
}