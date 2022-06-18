import java.lang.reflect.Array;
import java.util.Scanner;

public class Add_arrays {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Please enter "+n+" numbers");
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
