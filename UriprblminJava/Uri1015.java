
package javashuru.UriprblminJava;
import java.util.Scanner;
public class Uri1015 {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        double x1,y1,x2,y2,dis;

        
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextDouble();
        y2=input.nextDouble();
        
        dis= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.printf("%.4f\n",dis);
        
    }
    
}
