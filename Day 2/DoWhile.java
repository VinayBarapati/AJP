package ajp;

import java.util.Scanner;

public class DoWhile 
{
	 static void sumOfEven(int range) 
	{
		int num=0, sum=0;
		do {
			if(num %2==0)
				sum+=num;
			num++;
		}
		while(num<=range); {
			sum+=num;
			num++;
		}
		System.out.println("sum of even numbers in range"+range +"="+sum);
	}
	

	public static void main(String[] args) 
	{
		
		sumOfEven(14);
	}

}
