package OOPS;
import static java.lang.System.out;
import static java.lang.Math.*;
public class StaticMethods {
static String Companyname="btes";
static String name;
static 
{
	name="Yogesh";
	out.println(name);
}
public static void disp()
{
	System.out.println(PI);
	System.out.println(acos(23.56));
	out.println("Company name is:"+Companyname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println(Companyname);
		disp();
	}

}
