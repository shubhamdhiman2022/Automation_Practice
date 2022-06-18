package StringDemo;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Dad",rev="";
		System.out.println(name.length());
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
