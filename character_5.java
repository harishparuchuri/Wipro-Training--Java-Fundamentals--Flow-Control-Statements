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
public class character_5 {
    public static void main(String args[]){
        char s;
        Scanner sc=new Scanner(System.in);
        s=sc.next().charAt(0);
        if(s>=48 &&s<=57)
            System.out.println("digit");
        else if(s>='a'&& s<='z'||s>='A'&& s<='Z')
            System.out.println("Alphabhet");
        else
            System.out.println("Special Character");
    }
    
    
}
