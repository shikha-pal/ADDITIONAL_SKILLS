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
public class wrdgreaterthan5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
         String str1=" " ;int len=0;
         
       String str = sc.nextLine();
       str=   str + " ";
       for (int i = 0; i < str.length(); i++) 
       {  
           if(str.charAt(i)!=' '){
             str1 = str1 + str.charAt(i);
       }
           else{
           if(str1.length() > 5)
           
               System.out.println(str1); 
               str1=" ";
              }
       }
    
}
}
