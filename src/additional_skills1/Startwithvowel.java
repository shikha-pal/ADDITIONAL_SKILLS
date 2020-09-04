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
public class Startwithvowel {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String  str[] = new String[5];
        System.out.println("Enter 5 strings(names):");
        for(int i=0;i<5;i++)
        {  str[i] = sc.nextLine();}
         System.out.println("Names start with vowel: ");
       for(int i=0;i<5;i++)
       {
           char ch=(str[i].charAt(0));
           
           if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
           {
               System.out.println(str[i]);
           }
       }
}
}