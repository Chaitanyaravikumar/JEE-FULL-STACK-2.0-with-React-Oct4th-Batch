package Lab3;
import java.util.Scanner;
public class Exercise1 
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the size of the array: ");
			int size=sc.nextInt();
			int[] num=new int[size];
			System.out.println("Enter the array elements:");
			for(int i=0;i<size;i++) 
			{
				num[i]=sc.nextInt();
			}
			System.out.println("the integer array is");
			for(int i=0;i<size;i++)
			{	
				System.out.print(num[i]+"\t");
			}
			
			int sum=0;
			for(int i=0;i<size;i++) 
			{	
				sum=sum+num[i];
			}
			System.out.println();
			System.out.println("Sum = "+sum);
		}
	}
}
