package javaapplication1;
import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args){
        
    double a,b,c;
    Scanner input= new Scanner(System.in);
    a=input.nextDouble();
    b=input.nextDouble();
    c=input.nextDouble();
    if(a>b)
    { if (a>c)
    { System.out.println("The Largest number is :"+a);
    }    
    else
    {
    System.out.println("The Largest number is :"+c);
    }
    
    }
    else if(b>c)
            { System.out.println("The Largest number is :"+b);
            }
    else
    {System.out.println("The Largest number is :"+c);
    }
    
        }

    }

