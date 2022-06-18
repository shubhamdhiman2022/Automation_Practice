package ScannerDemo;

import java.util.Scanner;

public class Demo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno;
		float eng;
		double hindi;
		String name;
		char grade;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rollno");
		rollno=s.nextInt();
		
		System.out.println("Enter name");
		name=s.nextLine();
		s.nextLine();
		
		System.out.println("Enter marks in English");
		eng=s.nextFloat();
		
		System.out.println("Enter marks in Hindi");
		hindi=s.nextDouble();
		
		System.out.println("Enter Grade");
		grade=s.next().charAt(0);
	}

}
