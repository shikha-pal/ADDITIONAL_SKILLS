/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additional_skills1;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author 007
 */
public class Substring {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch;int count=0,f,l;
        System.out.println("Enter a string");
       String str = sc.nextLine();
        System.out.println("enter the index no. from where to where :");
        f= sc.nextInt();
        l=sc.nextInt();
        for(int i=f;i<=l;i++)
            System.out.print(str.charAt(i));
        
}
}
