package looping;
import java.util.Scanner;

public class Factorial {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value:");
			 
			int n=sc.nextInt();
			int i,fact=1;
			 for(i=1;i<n;i++)
			 {
				 fact=fact*i;
				 if(n==fact)
				 {
					 fact=1;
					 break;
				 }
			 }
			 if(fact==1)
			 {
				 System.out.println("yes");
			 }
			 else
			 {
				 System.out.println("No");
			 }

		}

	}


