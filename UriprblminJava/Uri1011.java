/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashuru.UriprblminJava;

import java.util.Scanner;
public class Uri1011 {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int R;
        R=input.nextInt();
        double radius,pi=3.14159;
         
        radius=(4.0/3)*pi*R*R*R;
        System.out.printf("VOLUME = %.3f\n",radius);
    }
}
