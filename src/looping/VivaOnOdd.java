package looping;
import java.util.Scanner;

public class VivaOnOdd {

	public static void main(String[] args) {

System.out.println("enter number:");
		Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        		 int n=1;
        double c=0;
        for(int i=0;n<=3;i++){
            a[i]=sc.nextInt();
            if(a[i]>0 && a[i]%2==0){
                if(i==0){
                    c=c-1;
                }
                else {
                    c=c-0.5;
                }
            }
            else if(a[i]>0 && a[i]%2!=0){
               c=c+1;
               n+=1;
            }
            else if(a[i]<0){
                c=c-0.5;
                break;
            }
        }
        System.out.println(c);


	}


		

	}


