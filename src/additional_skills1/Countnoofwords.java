/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Countnoofwords {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch;int count=0;
        System.out.println("Enter a string");
       String str = sc.nextLine();
       for(int i=0;i<str.length();i++)
       {   ch =str.charAt(i);
           if(ch == ' ')
               count ++;      
       }  
        System.out.println("The no. of words :" + (count+1));  
     
               
           
}
}