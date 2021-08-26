package looping;
import java.util.Scanner;


public class Lucas {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       System.out.println("enter value:");
        int n=s.nextInt();
        int a=0,b=0,c=1,d=0;
        System.out.print(a+" "+b+" "+c);
        for(int i=4;i<=n;i++){
            d=a+b+c;
            System.out.print(" "+d);
            a=b;
            b=c;
            c=d;
        }
		
	}

}


