package sum;
import java.util.*;
public class studentgradecalculator {

	public static void main(String[] args) {
	        int sum;
            Scanner a=new Scanner(System.in);
            System.out.println("enter the tamil mark:");
            int b=a.nextInt();
            System.out.println("enter the english mark:");
            int c=a.nextInt();
            System.out.println("enter the maths mark:");
            int d=a.nextInt();

            System.out.println("enter the science mark:");
            int e=a.nextInt();

            System.out.println("enter the social mark:");
            int f=a.nextInt();
              int total=b+c+d+e+f;
              System.out.println("The marks you scored:"+total);
              sum=total/5;
              System.out.println(sum+"%");
              if(sum>=90) {
            	  System.out.println("detination");
              }
              else if(sum>=70) {
            	  System.out.println("average");
              }
              else if(sum>=50) {
            	  System.out.println("need hardwork");
              }
              else {
            	  System.out.println("fail");
              }
            
            
            
	}         
}
