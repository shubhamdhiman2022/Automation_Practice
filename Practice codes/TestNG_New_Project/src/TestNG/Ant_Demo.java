package TestNG;
import java.util.Date;

public class Ant_Demo {
	
	public static String currentDate()
	{
		return new Date().toString();
	}
	
	public static void main(String args[])
	{
		System.out.println("Hello ant_demo program");
		System.out.println("Today's Date is: "+ currentDate());
	}

}
