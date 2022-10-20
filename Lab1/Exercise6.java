package Lab1;
import java.util.Scanner;
public class Exercise6 {
private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		int sum1=0,sum2=0;
		double diff=0;
		for(int i=0;i<=num;i++)
		{
			sum1+=(i*i);
			sum2=sum2+i;
		}	
		diff=sum1-Math.pow(sum2,2);
		System.out.println(diff);
	}

}
