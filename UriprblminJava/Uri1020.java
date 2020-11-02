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
public class Uri1020 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        int years = n/365;
        int months = n%365;
        int days = months%30;
        months = months/30;
 
          System.out.println(years+" ano(s)"); 
          System.out.println(months+" mes(es)"); 
          System.out.println(days+" dia(s)"); 
    }
}
