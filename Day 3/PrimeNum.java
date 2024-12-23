 package loops;

public class PrimeNum {

	public static void main(String[] args) 
	{
		int target=11,count=0;
		for(int num=2;num<target/2;num++)
		{
			if(target%num==0)
				count++;
			
			}
		if (count==0)
			System.out.println("Prime Number ");
		else
			System.out.println("Not a prime Number");
				
		}
	}
