package ExceptionHandlingDemo;

import java.io.IOException;
import java.util.Scanner;

public class ThrowDemo {
int age;
Scanner s=new Scanner(System.in);
public void accept() throws InvalidAgeException,IOException,ArithmeticException
{
	try {
		System.out.println("Enter age");
		age=s.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException();
		}
	} catch (InvalidAgeException e) {
		// TODO Auto-generated catch block
		System.out.println("Enter value of age not less then 18");
		age=s.nextInt();
	}
}
	public static void main(String[] args) throws InvalidAgeException, ArithmeticException, IOException {
		// TODO Auto-generated method stub
		ThrowDemo oo=new ThrowDemo();
		oo.accept();
	}

}
