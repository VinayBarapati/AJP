package loops;

public class ForLoop 
{
	
public static void main(String[] args) 
{
	int sum=0;
	int range=20;
	for(int i=0;i<range;i++) {
		if(i%2==0)
		sum+=i;              }
	System.out.println(sum);
}
}
