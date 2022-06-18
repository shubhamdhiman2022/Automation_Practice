package Collections;

import java.util.Scanner;

public class Arraydemo {
	int[] arr = new int[5];

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraydemo oo = new Arraydemo();
		oo.accept();
	}

}
