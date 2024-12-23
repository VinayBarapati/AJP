package loops;

public class Range 
{
	static void printprime(int range) {
		boolean b;
		for(int i=2;i<=range;i++) {
			b=true;
			first:for(int n=2;n<i/2;n++) {
				if(i%n==0) {
					b=false;
					break first;
						
				}
			}
			if(b)
				System.out.println(i+" ");
		}
	}
public static void main(String[] args) 
{
	printprime(99);
}
}
