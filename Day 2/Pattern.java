package ajp;

public class Pattern
{
	static void logic(int end) {
		int start=1;
		while(start<=end) 
		{
			 System.out.print(start+" ");
			 start++;
			 
		}
	}
	public static void main(String[] args) 
	{ 
		int start=1;
		int end=5;
		while(start<=end) {
			logic(start);
			System.out.println();
			start++;
			
		}
	
	}
}
