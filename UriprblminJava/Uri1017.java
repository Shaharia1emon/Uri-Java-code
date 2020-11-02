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
public class Uri1017 {
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        double x,y;
        x=input.nextDouble();
        y=input.nextDouble();
        double fule;
                fule=(x*y)/12;
        
        System.out.printf("%.3f\n",fule);
    }
}
