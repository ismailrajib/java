package javaapplication1;
import java.util.Scanner;
public class Vowelornot {
    
    public static void main(String[] args){
    char alp = 0;
    Scanner input= new Scanner(System.in);
    alp= input.next().charAt(alp);
            switch(alp){
        case 'a': System.out.println("This is a vowel");
        break;
        case 'e': System.out.println("This is a vowel");
        break;
        case 'i': System.out.println("This is a vowel");
        break;
        case 'o': System.out.println("This is a vowel");
        break;
        case 'u': System.out.println("This is a vowel");
        break;
        default:
        System.out.println("This is a Consonant");
        break;
        
        
}
    
}
}