package work;

import java.util.Scanner;

public class Text 
{

	public static void main(String[] args)
	{
		Scanner i=new Scanner(System.in);
		System.out.println("Enter first value");
		int n1=i.nextInt();	
		System.out.println("Enter second value23");
		int n2=i.nextInt();
		if (n1>n2) 
		{
			System.out.println("first number is BIG");
			System.out.println("Hello");
		 }
		else if(n2>n1) {
			System.out.println("second number is BIG");
		}
		else {
			System.out.println("Both are equal");
		}
		
	}

}
