/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashuru.UriprblminJava;
import java.util.Scanner;
public class Uri1008 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int NUMBER = input.nextInt();
        double tk= input.nextDouble();
        double h= input.nextDouble();
        double SALARY = tk*h;
        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
    }
}
