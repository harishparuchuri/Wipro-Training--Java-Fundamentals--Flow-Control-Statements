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
public class palindrome_18 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;
            
        }
        if(t==sum)
        System.out.println(t+" is palindrome");
        else
            System.out.println(t+" is not palindrome");
    }

    
}
