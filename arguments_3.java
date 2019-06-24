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
class arguments_3
{
    public static void main (String[] args) 
    {
        if (args.length ==0)
            {
            System.out.println("No Values");
    }
        else{
            for(String i : args)     
                System.out.print(i+" , ");
        
        }
        }
        }