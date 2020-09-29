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
public class Leftinvertedtraingle {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
         String str1=" " ;int j=0,k=0,i=0;
         
       String str = sc.nextLine(); 
       System.out.println("PATTERN:");
       for(j=str.length();j>=0;j--)
       
       { 
           for(i=k;i<str.length();i++)
           {  
               System.out.print(str.charAt(i));
           }
           k++;
           System.out.println("\n");
       }
}
}