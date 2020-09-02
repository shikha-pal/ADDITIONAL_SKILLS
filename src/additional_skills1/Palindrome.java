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
public class Palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int count =0;
       
        System.out.println("Enter a string");
       String str = sc.nextLine();
       for(int i=0,j=(str.length()-1);i<str.length();i++,j--)
       {
         if(str.charAt(i)==str.charAt(j))   
         { 
           count++ ;}
         else
         {  System.out.println("Not a palindrome");
             break;}
       }
       if(count==(str.length()))
               {
        System.out.println("PALINDROME");}
        System.out.println(count);
}
}
