package looping;
import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		
				int n,i=1,sum=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value of n");
				n=sc.nextInt();
				while(i<=n) {
					
					System.out.println("Enter the number");
					int a=sc.nextInt();
					sum=sum+a;
					i++;
					}
					System.out.println("The sum is "+sum);
					

			}

		}
	


