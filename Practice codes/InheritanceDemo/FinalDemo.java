package InheritanceDemo;

public class FinalDemo {
	final float pie=3.14f;
	float r=12.3f,area;
	public FinalDemo()
	{
		
	}
	public void acc()
	{
		
		area=pie*r*r;
		//pie++;
		System.out.println("Area of Circle is:"+area);
	}
public static void main(String[] a)
{
	FinalDemo oo=new FinalDemo();
	oo.acc();
}

}
class A11 extends FinalDemo
{
	public void acca()
	{
		System.out.println(pie);
	}
}