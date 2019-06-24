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
public class Prime_between_13 {
    
    public static void main(String args[])
    {
        
        int c=0;
        for(int j=10;j<=99;j++)
        {
            c=0;
        for(int i=2;i<=j/2;i++)
        {
            if(j%i==0)
            c++;
        }
        if(c>0)
            continue;
        else
            System.out.println(j+" prime");
    }    
    }

    
}
