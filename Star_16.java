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
public class Star_16 {
    public static void main(String args[]){
        int i=1,j,n;
        
        Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     while(i<=n){
        for(j=1;j<=i;j++)
         System.out.print("* ");
        i++;
        System.out.println(" ");
    }
     
        
        
    }
    
}
