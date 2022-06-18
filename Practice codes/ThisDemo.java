package OOPS;

public class ThisDemo {
int num1=20;
public ThisDemo()
{
	this(1000);
	System.out.println("Constructor Calling");
	
}
public ThisDemo(int num1) {
	// TODO Auto-generated constructor stub

//	this();
	this.num1=num1;
	System.out.println(num1);
	System.out.println(this.num1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo oo=new ThisDemo();
		
	}

}
