package ajp;

import java.util.Scanner;

public class Pallindrome 
{
	 void ispollindrome(int number) 
	 {   
		
		 int reminder,reverse=0,temp;
		 temp=number;
		 while (number>0)
		 {
			 reminder=number%10;
			 reverse=reverse*10+reminder;
			 number=number/10;
		}
		 if (reverse==temp) 		 
			System.out.println("pallindrome Number");
		 else
            System.out.println("Not a pallindrome");
		 }
	 public static void main(String[] args) 
	{
		Pallindrome p=new Pallindrome();
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter value");
		 int n=s.nextInt();
		p.ispollindrome(n);
		
	}

}
