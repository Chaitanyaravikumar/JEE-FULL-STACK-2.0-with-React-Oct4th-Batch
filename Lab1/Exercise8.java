package Lab1;
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number");
			int num=sc.nextInt();
			boolean result=checkNumber(num);
			if(result)
				System.out.println(num+" is power of 2");
			else
				System.out.println(num+" is not power of 2");
		}
	}
	
	static boolean checkNumber(int n) {
		if(n<=0) {
			return false;
		}
		while(n>1) {
			if(n%2!=0) {
				return false;
			}
			n=n/2;
		}
		return true;
		
	}

}
