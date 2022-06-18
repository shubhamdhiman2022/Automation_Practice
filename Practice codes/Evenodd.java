package practice1;
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of number");
		num= sc.nextDouble();
		if(num %2==0)
		{
		System.out.println("Result: Number is even");	
		}
		else
		{
			System.out.println("Result: Number is odd");
		}
sc.close();
}
}
