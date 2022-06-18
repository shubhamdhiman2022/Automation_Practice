package OOPS;

public class ConstructorDemo {
	int num1,num2,sum;
public ConstructorDemo()
{
	num1=20;
	num2=38;
	
}
public ConstructorDemo(int num,int num3)//Parameterized Constructor
{
	sum=num+num3;
	System.out.println(sum);
}
//Constructor Overloading
public ConstructorDemo(String name)
{
	System.out.println(name);
}
	public void add()
	{
		num1=100;
		num2=30;
	}
public void disp()
{
	sum=num1+num2;
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo oo=new ConstructorDemo();//Constructor calling
		//oo.add();
		oo.disp();
		ConstructorDemo obj=new ConstructorDemo(10,20);
		ConstructorDemo obj1=new ConstructorDemo("Yakshi");
	}

}
