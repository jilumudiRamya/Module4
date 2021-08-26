package looping;
import java.util.Scanner;


public class P2Collatz {
public static void main(String[] args) {
	System.out.println("enter value");
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=0;
				while(a>1)
				{
					if(a%2==0)
					{
						a=a/2;
					}
					else
					{
						a=(3*a)+1;
					}
					System.out.println(a);
					b++;
				}
				System.out.println(b);

			}

		}
	