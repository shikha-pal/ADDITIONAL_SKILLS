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
public class lexographics {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int l=0,l1=0,f=0;
        System.out.println("Enter a string:");
       String str = sc.nextLine();
       System.out.println("Enter second string:");
       String str1 = sc.nextLine();
       while(l<str.length()&&l1<str1.length())
       {
           if(str.charAt(l)<str1.charAt(l1))
           {
               f=0;break;
           }
          if(str.charAt(l)>str1.charAt(l1))
           {
               f=1;break;
           }
          else if(l==str.length()-1 || l1==str1.length())
          {
              f=2;break;
          }
          l++;l1++;
       }
       if(f==0)
             System.out.println("Lexical Order is:  "+str + " " +str1);
       else if(f==1)
             System.out.println("Lexical Order is:  "+str1 + " " +str);
       else
             System.out.println("strings are equal");
       
}
}