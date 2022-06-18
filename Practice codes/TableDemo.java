import java.util.Scanner;
public class TableDemo
{
	public static void main(String[] ar)
	{
		int num,counter=1;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		num=s.nextInt();
		while(counter<=12)
		{
			System.out.println(num+"*"+counter+"="+num*counter);
			counter++;
		}
		
	}
}