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
public class reverse_17 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;
            
        }
        System.out.println(sum);
    }

    
}
