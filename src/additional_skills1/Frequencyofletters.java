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
public class Frequencyofletters {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i;
       int ch []=new int[256];
        System.out.println("Enter a string:");
       String str = sc.nextLine();
       
         for (i = 0; i < str.length(); i++) {
            ch[(int) str.charAt(i)]++;
        }
   
        for (i = 0; i < 256; i++) {
            if (ch[i] != 0) {
                  System.out.println("The character " + (char) i  + " has occurred for " + ch[i] + " times");
            }
        }
}
}