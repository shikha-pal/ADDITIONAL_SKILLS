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
public class Shortform {
    public static void main(String[] args) throws IOException{
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        str= " " +str;
        for (int i = 0; i < str.length()+1; i++) 
            if (str.charAt(i) == ' ') 
                System.out.print( Character.toUpperCase(str.charAt(i + 1)) + "."); 
    } 
        // TODO code application logic here
    
    
    
}
