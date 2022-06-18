
public class String_reverse {

	public static void main(String[] args) {
		
		String str= "New testing world";
		System.out.println(str);
		StringBuilder str1= new StringBuilder("New testing world");
		str1.append("test");
		System.out.println(str1);
		System.out.println(str1.reverse());
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char reverse1= str.charAt(i);
			String reverse= Character.toString(reverse1);
			System.out.print(reverse);
		}
		
	}

}
