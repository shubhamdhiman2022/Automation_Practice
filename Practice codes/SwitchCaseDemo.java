import java.util.Scanner;
public class SwitchCaseDemo
{	
	public static void main(String[] ar)
	{
		int choice,num1,num2,res;
		Scanner s=new Scanner(System.in);
		System.out.println("1.Add\t\t2.Subtract\n3.Multiply\t4. Divide");
		
		System.out.println("Enter value for Num1");
		num1=s.nextInt();
		
		System.out.println("Enter value for Num2");
		num2=s.nextInt();
		
		System.out.println("Enter your choice");
		choice=s.nextInt();
		
		switch(choice)
		{
			case 1:
			res=num1+num2;
			System.out.println("REsult of Addition is:"+res);
			break;
			
			case 2:
			res=num1-num2;
			System.out.println("REsult of Subtraction is:"+res);
			break;
			
			case 3:
			res=num1*num2;
			System.out.println("REsult of Multiplication is:"+res);
			break;
			
			case 4:
			res=num1/num2;
			System.out.println("REsult of Division is:"+res);
			break;
			
			
			default:
			System.out.println("Sorry you entered the wrong choice");
			break;
		}
		
		
	}
}