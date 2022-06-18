import java.util.Scanner;
public class factorialDemo
{
	public static void main(String[] a)
	{
		int num,i=1,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any num for which u want to print factorial");
		num=s.nextInt();
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of:"+num+":"+fact);
		
		
	}
}