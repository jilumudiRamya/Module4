package looping;
import java.util.Scanner;
public class Print3 {
	

		public static void main(String[] args) {
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of a:");
			a=sc.nextInt();
			System.out.println("enter the value of b:");
			b=sc.nextInt();
			if(a<=b)
			{
				while(a<=b)
				{
					System.out.println(a);
					a++;
				}
			}
			else
			{
				while(a>=b)
				{
					System.out.println(a);
					a--;
					
				}
			}
			
		}

}
