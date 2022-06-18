import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		
		int num,remainder,number,reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to reverse a number: ");
		num= sc.nextInt();
		number= num;
		while(num!=0)
		{
			remainder = num%10;
			reverse = (reverse*10)+remainder;
			num = num/10;
		} 
		System.out.println("Reverse number is : "+reverse);
		if(reverse==number)
		{
			System.out.println("Number is palindrome: "+ number);
		}
		else
		{
			System.out.println("Number is not palindrome: "+number);
		}

	}

}
