package StringDemo;

public class CheckLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uname="admin",pass="admin";
		String str=new String("Admin");
		if((uname.equalsIgnoreCase(str))&&(pass.equalsIgnoreCase(str)))
		{
			System.out.println("Valid User");
		}
		else
		{
			System.out.println("Not valid user");
		}
	}

}
