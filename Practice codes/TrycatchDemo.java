package ExceptionHandlingDemo;

import java.util.Scanner;

public class TrycatchDemo {
int dividend,divisor,res;
Scanner sc=new Scanner(System.in);
public void calculate()
{
	try
	{
	System.out.println("enter value for dividend");
	dividend=sc.nextInt();
	
	System.out.println("Enter value of divisor");
	divisor=sc.nextInt();
	res=dividend/divisor;
	System.out.println("Result is:"+res);
	}
	
//	catch(ArithmeticException e)
//	{
//		System.out.println("change the value of divisor enter it again");
//		divisor = sc.nextInt();
//		res=dividend/divisor;
//		System.out.println("Result is:"+res);
//	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	//	System.out.println(e.getStackTrace());
	}
	catch (Exception e) {
		// TODO: handle exception
		
	}
	finally
	{
		sc.close();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrycatchDemo oo=new TrycatchDemo();
		oo.calculate();
	}

}
