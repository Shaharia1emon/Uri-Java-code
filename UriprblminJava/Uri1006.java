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
public class Uri1006 {
      public static void main(String[]args)
{
    Scanner input = new Scanner(System.in);
    double A = input.nextDouble();
    double B=input.nextDouble();
    double C =input.nextDouble();
    double MEDIA =  (A*2+B*3+C*5)/(2+3+5);
    System.out.printf("MEDIA = %.1f\n",MEDIA);
}
}
