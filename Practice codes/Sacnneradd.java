package practice1;
import java.util.Scanner;
public class Sacnneradd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1");
		num1 = sc.nextInt();
		System.out.println("Enter the value of num2");
		num2 = sc.nextInt();
		sum= num1 + num2;
		System.out.println("Sum of num1 and num2 : "+sum);
		sc.close();
	}

}
