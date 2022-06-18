import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
			
		long a, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to find out the factorial: ");
		a= sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact= fact*i;
		}
		System.out.println("factorial of number "+a+" is : "+fact);
		
		
	}

}
