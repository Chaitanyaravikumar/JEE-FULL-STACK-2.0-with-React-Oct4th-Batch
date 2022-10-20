package Lab1;

import java.util.Scanner;

public class Exercise5 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(calculateSum(n));
		
	}
	private static int calculateSum(int n) 
	{
		int result=0;
		for(int i=1;i<=n;i++) 
		{
			if(i%3==0 || i%5==0) 
			{
				result +=i;
			}
		}
		return result;
	}

}
