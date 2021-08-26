package looping;
import java.util.Scanner;
public class Valid {

	public static void main(String[] args) {
	
				 Scanner sc=new Scanner(System.in);
			        int a,c=-1;
			        do{
			        	System.out.println("enter number:");
			            a=sc.nextInt();
			            c++;
			        }while(a%8==0);
			        System.out.println("the number of valid numbers entereds is "+ c);
				}
		}
	

