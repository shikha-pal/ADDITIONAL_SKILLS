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
public class Piglatin {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int count=0;
        System.out.println("Enter a string");
       String str = sc.nextLine(); 
       for(int i=0;i<str.length();i++)
       {  char ch = str.charAt(i);
           if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
           {
               System.out.println(str.substring(i, (str.length()))+ str.substring(0, i)+"ay");
               break;
           }
               }
}
}
