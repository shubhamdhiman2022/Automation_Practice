import java.util.Scanner;

public class Word_count {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String str= sc.nextLine();
		
		if(str==null || str.isEmpty())
		{
		System.out.println("please enter string");	
		}
		else
		{
			String arr[] = str.split("\\s+");
			System.out.println("no. of words is: "+ arr.length);
		}
		
	}

}
