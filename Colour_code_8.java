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
public class Colour_code_8 {
    public static void main(String args[]){
        char s;
        Scanner sc=new Scanner(System.in);
        s=sc.next().charAt(0);
        switch(s){
        case 'R':
                System.out.println("Red");
                break;
        case 'B':
                System.out.println("Blue");
                break;
        case 'G':
                System.out.println("Green");
                break;
        case 'O':
                System.out.println("Orange");
                break;
        case 'Y':
                System.out.println("Yellow");
                break;
        case 'W':
                System.out.println("White");
                break;
        default:
                System.out.println("Invalid Code");
                break;
                                    
                                    
        }
    }
    
}
