import java.util.Scanner;

public class Prime_number {
	
	
	
	static boolean prime_Num(int num)
	{
		boolean is_prime= true;
		if(num<=1) {
			is_prime= false;
		}
		else {
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					is_prime= false;
					break;
				}
			}
		}
		
		return is_prime;
		
		
	}

	public static void main(String[] args) {
		
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number: ");
		num= sc.nextInt();
		boolean is_prime = prime_Num(num);
		 
		if (is_prime)
		{
		System.out.println(num+" is a prime number.");
		}
		else
		{
		System.out.println(num+" is not a prime number.");
		}
		 
		sc.close();
	}

}
