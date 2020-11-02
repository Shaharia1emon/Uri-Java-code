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
public class Uri1005 {
    public static void main(String[]args)
{
    Scanner input = new Scanner(System.in);
    double A = input.nextDouble();
    
    double B =input.nextDouble();
    double MEDIA = (A*3.5+B*7.5)/(3.5+7.5);
    System.out.printf("MEDIA = %.5f\n",MEDIA);
}
}
