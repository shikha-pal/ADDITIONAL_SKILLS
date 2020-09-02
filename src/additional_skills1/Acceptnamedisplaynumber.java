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
public class Acceptnamedisplaynumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch;int count=0;
        System.out.println("Enter a string of Day:");
       String string = sc.nextLine();
       string=string.toLowerCase();
       switch(string)
       {
           case "monday":
               System.out.println("1");
               break;
            case "tuesday":
               System.out.println("2");
                break;
            case "wednesday":
               System.out.println("3");
                break;
            case "thursday":
               System.out.println("4");
                break;
            case "friday":
               System.out.println("5");
                break;
            case "saturday":
               System.out.println("6"); 
               break;
            case "sunday":
               System.out.println("7");
                break;
            default:
                System.out.println("Wrong Choice ");
                break;
                          
       }
}
}
