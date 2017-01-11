
package homework;

import java.util.Scanner;


public class PrintEven {
    public static void main (String[] args){
        int num,i;
        System.out.println("Enter a Number :");
        Scanner input= new Scanner(System.in);
        num=input.nextInt();
       for(i=0;i<=num;i++)
       {
           if(i%2==0){
               System.out.println(+i);
               
           }
       }
        
    }
    
}
