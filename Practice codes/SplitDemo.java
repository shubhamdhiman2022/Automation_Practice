package StringDemo;

import java.util.Scanner;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String[] str1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string value");
		str=sc.nextLine();
		
		str1=str.split(" ");
		System.out.println(str1[1]);
//		System.out.println(str.toUpperCase());
		System.out.println(str.substring(3,6));
	}

}
