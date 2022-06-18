package OOPS;

import java.util.Scanner;

public class NumbersDemo {
float num1,num2,res;

Scanner s=new Scanner(System.in);
public void enter()
{
	for(int i=0;i<10;i++)
	{
	System.out.println("Enter value for num1");
	num1=s.nextInt();
	
	System.out.println("Enter value for num2");
	num2=s.nextInt();
	}
	
}
public void add1()
{
	int num3;
	//num3=s.nextInt();
//	System.out.println(num3);
//	res=num1+num2;
////	return res;
//	for(int i=0;i<10;i++)
//	{
//		
//	}
}





//public void add()
//{
//	res=num1+num2;
//	System.out.println("REsult of Addition of two numbers:"+res);
//
//}
//
//public void subtract()
//{
//	res=num1-num2;
//	System.out.println("REsult of Subtraction of two numbers:"+res);
//}
//
//public void multiply()
//{
//	res=num1*num2;
//	System.out.println("REsult of Multiplication of two numbers:"+res);
//	
//}
//
//public void divide()
//{
//	res=num1/num2;
//	System.out.println("REsult of Division of two numbers:"+res);
//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumbersDemo oo=new NumbersDemo();
		//oo.enter();
		oo.add1();
		//System.out.println(oo.add1());
//		oo.add();
//		oo.multiply();
		

	}

}
