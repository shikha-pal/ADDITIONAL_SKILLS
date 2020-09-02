/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additional_skills1;

import java.util.Scanner;

/**
 *
 * @author 007
 */
public class Compare2strings {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch; int i,c=0;
        System.out.println("Enter two strings:");
       String str = sc.nextLine();
       String str1 = sc.nextLine();
       if(str.length()==str1.length())
       {
           for( i =0; i<str.length();i++)
           {
               if(str.charAt(i)==str1.charAt(i))
               {  c++;}         
           }            
       }     
       else
       {System.out.println("As length of two strings does not match so also not equal");
       }
       if(c==str.length())
       {  System.out.println("hurrah!  Strings are equal");}
       else 
        System.out.print("strings are not same");
    }
}

