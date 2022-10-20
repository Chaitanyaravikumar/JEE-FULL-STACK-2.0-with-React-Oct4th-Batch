package Lab1;
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number : ");
			int num=sc.nextInt();
			int sum=0;
			while(num!=0){
				int digit=num%10;
				sum=sum+(digit*digit*digit);
//			sum=sum+digit;
				num=num/10;
			}
			System.out.println("Sum of cube of digit:" +sum);
		}
	}
}

