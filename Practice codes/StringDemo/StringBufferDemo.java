package StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer str=new StringBuffer("Tom");
str.append("Cat");
System.out.println(str);
str.reverse();
System.out.println(str);
System.out.println(str.capacity());
str.delete(3, 5);
System.out.println(str);
System.out.println(str.indexOf("t"));

	}

}
