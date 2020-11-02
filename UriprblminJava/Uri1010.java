/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashuru.UriprblminJava;
import java.util.Scanner;

public class Uri1010 {
public static void main(String[]args)
{
      Scanner input = new Scanner(System.in);
      
      int c1,c2,n1,n2;
      double p1,p2,total;
      c1 = input.nextInt();
      n1= input.nextInt();
      p1= input.nextDouble();
      
      
      c2 = input.nextInt();
      n2= input.nextInt();
      p2 = input.nextDouble();
      
      total= (n1*p1)+(n2*p2);
      
      System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
}
 
}
