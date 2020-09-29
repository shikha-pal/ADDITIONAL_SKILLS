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
public class Tabularform {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str[]=new String[20];
       int r [] = new int[20];
       int i=0;
       System.out.println("Enter name and roll no. of 5 students:");
       for( i=0;i<5;i++)
       {
            str[i]=sc.nextLine();
       }
        for( i=0;i<5;i++)
       {
         r[i] =sc.nextInt();
       }
        System.out.println("Names              Rollno.");
      for(i=0;i<5;i++)
      {
          System.out.println(str[i]+"             "+r[i]);
          
      }
}
}