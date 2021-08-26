package looping;
import java.util.Scanner;
public class TrendyNum {

	public static void main(String[] args) {
		int a,count=0;
		System.out.println("enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=(n/10)%10;
		while(n!=0) {
			n=n/10;
			count++;
			
		}
		if(a%3==0 && count==3) {
			System.out.println("Trendy Number");
			
		}
		else {
			System.out.println("Not a Trendy Number");
		}

	}

}


