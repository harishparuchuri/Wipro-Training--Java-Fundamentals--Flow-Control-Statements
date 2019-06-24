/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode.Flow_Control_Statements;

/**
 *
 * @author haris
 */
import java.util.*;
public class Prime_12 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            c++;
        }
        if(c>0)
            System.out.println(n+" not prime");
        else
            System.out.println(n+" prime");
    }    
}
