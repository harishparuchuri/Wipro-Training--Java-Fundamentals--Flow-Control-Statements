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
public class lowercase_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char s;
        s=sc.next().charAt(0);
        if(Character.isLowerCase(s))
            System.out.println(s+"->"+Character.toUpperCase(s));
        else
          System.out.println(s+"->"+Character.toLowerCase(s));  
        
    }
    
}
