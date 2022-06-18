import java.util.Scanner;

public class Odd_even_number {
	
	
	static void find_odd(long num)
	{
		if(num%2==0)
		{
			System.out.println(num+ ": Number is even");
		}
		else {
				System.out.println(num+ ": Number is odd");
			
		}
	}

	public static void main(String[] args) 
	
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number: ");
		long num= sc.nextLong();
		find_odd(num);
		

	}

}
