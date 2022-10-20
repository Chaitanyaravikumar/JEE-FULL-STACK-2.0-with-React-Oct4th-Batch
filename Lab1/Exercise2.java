package Lab1;
import java.util.Scanner;
public class Exercise2 {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int ch=0;
			System.out.println("Enter your choice: ");
			System.out.println(" 1.Red\n 2.Yellow\n 3.Green");

			 ch = sc.nextInt();
			switch(ch){
			case 1: System.out.println("Stop");
					break;
			case 2: System.out.println("Ready");
					break;
			case 3: System.out.println("Go");
					break;
			default: System.out.println("Invalid Choice");
			}
		}
	}
}
	
