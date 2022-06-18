
public class Fibonacci_serious
{
	
	static void fibonacci(int n)
	{
		int n1=0,n2 = 1,count=0;
		
		while (count < n)
		{
			int n3= n1+n2;
			System.out.print(n1+" ");
			n1= n2;
			n2=n3;
			count= count+1;
		}
	}

	public static void main(String[] args) {
		
		fibonacci(10);
		
	}

}
