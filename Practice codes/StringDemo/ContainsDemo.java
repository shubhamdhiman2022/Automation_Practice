package StringDemo;

public class ContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dad how are you?";
		System.out.println(str.length());
		if(str.contains("ARE"))
		{
			System.out.println("how is present in string ");
		}
		else
		{
			System.out.println("No present");
		}
		System.out.println(str.replace('o', 'a'));
			//str.split(" ");
		//	System.out.println(str[0]);
	}

}
