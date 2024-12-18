package work;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		
		Scanner ex=new Scanner(System.in);
		System.out.println("Enter first value");
		int num1=ex.nextInt();
		System.out.println("Enter second value");
		int num2=ex.nextInt();
		System.out.println("Enter third value");
		int num3=ex.nextInt();
	
		if (num1>num2 && num1>num3) {
			System.out.println("First value is Big");
			
		}
		else if(num2>num3 && num2>num1) {
			System.out.println("second value is Big");
		
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("third value is Big");
		}
		else {
			System.out.println("Equal values5");
		}
	}

}
