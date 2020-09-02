/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additional_skills1;

/**
 *
 * @author 007
 */
import java.util.*;
import java.io.*;
public class Isuppercaseletter {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
       String str = sc.nextLine();
       for(int i=0;i<str.length();i++)
       { if(Character.isUpperCase(str.charAt(i)))        
                System.out.print(Character.toLowerCase(str.charAt(i)));
           else             
           System.out.print( Character.toUpperCase(str.charAt(i)));
       }                
    }   
}
