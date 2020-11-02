/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashuru.UriprblminJava;
import java.util.Scanner;

/**
 *
 * @author Shaharia Emon
 */
public class Uri1014 {
public static void main(String[]args)
{
    Scanner input=new Scanner(System.in);
    int X=input.nextInt();
    double Y=input.nextDouble();
    double distance=(X/Y);
    
    System.out.printf("%.3f km/l\n",distance);
}
}
