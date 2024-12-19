package ajp;

public class FactorialNum
{
	int factorial(int num) 
	{
		int fact=1;
		while (num>=1)
		{ 
			fact*=num;
			num--;
		}
		return fact;
	}
	
	public static void main(String[] args) 
	{
		FactorialNum fact=new FactorialNum();
		int result=fact.factorial(5);
		System.out.println(result);
		

	}

}
