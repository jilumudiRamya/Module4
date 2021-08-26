package looping;
import java.util.Scanner;


public class TargetPratice {

	public static void main(String[] args) {
		
		int a,i=0,c=0,s=0;
		System.out.println("enter numbers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		do
		{
			c++;
			a=sc.nextInt();
			s+=a;
			i++;
		}
		while(s<n);
		System.out.println("the no of turns is :"+c);


	}

}
