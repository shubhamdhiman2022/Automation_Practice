
public class Fibonacci {
	//while loop
	public static void fab(int n)
	{
		System.out.println("While loop start...");
		int a=0,b=1,counter=0,c;
		while(counter<n)
		{
			System.out.print(a+" ");
			c= a+b;
			a=b;
			b=c;
			counter=counter+1;
		}
		System.out.println();
	}
	//for loop
	static void fab_for_loop(int n)
	{
		System.out.println("For loop start...");
		int a=0,b=1,c;
		for(int i=0;i<n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		int n=10;
		fab(n);
		fab_for_loop(n);

	}

}
