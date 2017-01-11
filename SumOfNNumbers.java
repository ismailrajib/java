
package homework;

import java.util.Scanner;


public class SumOfNNumbers {
    public static void main(String[]args){
     int num,i=1,sum=0;
     double avg=0;
             Scanner input= new Scanner(System.in);
        num=input.nextInt();
        for(i=1;i<=num;i++){
          sum = sum+i;
          
          avg= (avg+sum)/num;
          
           
            
        } System.out.println("The Sum of n number is :" +sum);
        System.out.println("The avg of n number is :" +avg);

        }
        
    }
    

