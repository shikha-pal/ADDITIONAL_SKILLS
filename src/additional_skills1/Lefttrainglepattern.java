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
public class Lefttrainglepattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
         String str1=" " ;int len=0,i=0,j;
         
       String str = sc.nextLine();
        System.out.println("PATTERN:");
       for(i=0;i<str.length();i++)
       {
           for(j=0;j<=i;j++)
           {
               System.out.print(str.charAt(j));
           }    
           System.out.println("\n");
       }
}
}