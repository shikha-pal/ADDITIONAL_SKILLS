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
public class guessgender {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str1,str2;int c=0;
        System.out.println("Enter a Name(with title):");
       String str = sc.nextLine();
       for(int i=0;i<str.length();i++)
       {if(str.charAt(i)==' ')
       { c++;
           str1= str.substring(0,i);
       str1=str1.toLowerCase();
       str2 = str.substring(i+1,str.length());
       str2=str2.toLowerCase();
           
                switch(str1)
                {case "miss":
                    System.out.println("FEMALE");
                    c++;
                    break;
                case "mr.":
                      System.out.println("MALE");
                      c++;
                    break;
                case "mrs.":
                    System.out.println(" MARRIED FEMALE");
                    c++;
                    break;
                
                }
                switch(str2)
                {
                    case "kumari":
                        System.out.println("FEMALE");
                        c++;
                        break;
                    
                }
                }
          
       

       
}
       if(c==0)
        System.out.println("CANNOT DETECTED");
}
    }

