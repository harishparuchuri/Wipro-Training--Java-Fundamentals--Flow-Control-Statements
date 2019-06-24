/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode.Flow_Control_Statements;

import java.util.Scanner;

/**
 *
 * @author haris
 */
public class Isprime_14 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int n=sc.nextInt();
        int c=0;
        
        if(n==1||n==0)
            System.out.println("1 is neither prime nor composite");
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            c++;
        }
        if(c>0)
            System.out.println(n+" is not a prime number");
        else
            System.out.println(n+" is a prime number");
    }    

    
}
