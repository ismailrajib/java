/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


public class SimplesSwitchCase {
    public static void main(String[] args){
        int num;
        System.out.println("Enter a number from 0 to 5");
        Scanner input= new Scanner(System.in);
        num= input.nextInt();
        switch(num)
                {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("WRONG INPUT");
                
        }
        
        
    }
    
}
