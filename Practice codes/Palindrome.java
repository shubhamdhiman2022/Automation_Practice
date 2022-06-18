import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String orignal,reverse="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the word/number: ");
		orignal= sc.nextLine();
		int length = orignal.length();
		for(int i = length-1;i>=0;i--)
		{
			reverse= reverse+orignal.charAt(i);
			
		}
		if(reverse.equalsIgnoreCase(orignal))
		{
			System.out.println(orignal+" String/number is palindrome");
		}
		else
		{
			System.out.println(orignal+" String/number is not palindrome");
		}
		
		
	}

}
