import java.util.Scanner;
public class forloop
{
	public static void main(String[] a)
	{
		int fact =1,num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any num");
		num=s.nextInt();
		
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}