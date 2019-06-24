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
public class Positive_1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
            System.out.println(n+" is positive");
        else if(n<0)
                System.out.println(n+" is Negative");
        else
            System.out.println(n+" is Zero");
    }
    
}
