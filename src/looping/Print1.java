package looping;
import java.util.Scanner;

public class Print1 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter value of a:");
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter value of b:");
		
		
		b=sc.nextInt();
		while(a<=b) {
			System.out.println(a);
			a++;
		}

	}



}
