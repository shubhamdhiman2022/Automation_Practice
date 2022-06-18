package OOPS;

public class MethodsDemo {
	int sum,num1,num2;
//Taking something returning Nothing
	public void add(int num1,int num2)//Mathod Parameter/ Signatures
	{
		sum=num1+num2;
		System.out.println("Sum Is:"+sum);
	}
	//taking something REturning something
	public int add1(int num1,int num2)//Mathod Parameter/ Signatures
	{
		sum=num1+num2;
		return sum;
	}
	
	//Taking Nothing returning Something
	public int add2()
	{
		num1=1000;
		num2=2000;
		return sum=num1+num2;
	}
	
	//Taking nothing returning nothing
	public void add3()
	{
		sum=num1+num2;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo oo=new MethodsDemo();
		oo.add(10,20);
		System.out.println(oo.add1(100, 200));
		System.out.println(oo.add2());
		oo.add3();
		EmployeeDemo oo1=new EmployeeDemo();
		oo1.EnterDetails();
	}

}
