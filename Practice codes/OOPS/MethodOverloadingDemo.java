package OOPS;

public class MethodOverloadingDemo {
	int num1,num2,sum;
public void add()
{
	num1=100;
	num2=233;
	sum=num1+num2;
	System.out.println(sum);

}
public void add(int num1,int num2,int num3)
{
	System.out.println(sum=num1+num2+num3);
	add(10.20,30.4);
}
public void add(double num1,double num2)
{
	System.out.println(sum=(int) (num1+num2));//Explicit Type Casting
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo oo=new MethodOverloadingDemo();
		oo.add();
		oo.add(10.20,20.22);
		oo.add(22,44,66);
	}

}
