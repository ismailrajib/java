package javaapplication1;
import java.util.Scanner;
public class LetterGrade {
    public static void main(String[] args){
        double marks;
          Scanner input= new Scanner(System.in);
                marks=input.nextDouble();
                if(marks>=0 && marks<33)
                {
                    System.out.println(" The Student has Failed");
                }
                else if(marks>=33 && marks <40)
                {
                       System.out.println(" The Student Got D");
                }
                else if(marks>=40 && marks <50)
                {
                       System.out.println(" The Student Got C");
                }
                else if(marks>=50 && marks <60)
                {
                       System.out.println(" The Student Got B");
                }
                else if(marks>=60 && marks <70)
                {
                       System.out.println(" The Student Got A-");
                }
                else if(marks>=70 && marks<80)
                {
                       System.out.println(" The Student Got A");
                }
                 else if(marks>=80 && marks<=100)
                {
                       System.out.println(" The Student Got A+");
                }
                 else if(marks<0 && marks>100)
                {
                       System.out.println(" You have entered the wrong Score");
                }
}
}