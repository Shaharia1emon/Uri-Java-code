/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashuru.UriprblminJava;
import java.util.Scanner;


public class Uri1012 {
public static void main(String[]args)
{
    Scanner input=new Scanner(System.in);
     double A,B,C;
    A=input.nextDouble();
    B=input.nextDouble();
    C=input.nextDouble();
    
     double T = 0.5f*A*C;
      
        double R = 3.14159*C*C;
        
        double TRA = ((A+B)/2)*C;

        double S = B*B;

        double RAC= A*B;
        
        System.out.printf("TRIANGULO: %.3f\n",T);
        System.out.printf("CIRCULO: %.3f\n",R);
        System.out.printf("TRAPEZIO: %.3f\n",TRA);
        System.out.printf("QUADRADO: %.3f\n",S);
        System.out.printf("RETANGULO: %.3f\n",RAC);
    
}
}
