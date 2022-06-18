package practice1;
import java.util.Scanner;

public class LenearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,num,item,array[];
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		array= new int[num];
		System.out.println("Enter "+num+" Elements");
		for( a=0; a<num; a++)
			array[a]=sc.nextInt();
		for(int b: array)
		{
		System.out.println("values for arrays "+b);
		}
		System.out.println();
		System.out.println("Enter the value for Search element");
		item= sc.nextInt();
		for(a=0; a<num; a++)
		{
			if(array[a]==item)
			{
			System.out.println(item+" is present at location"+(a+1));	
			break;
			}
			else
			{
				System.out.println(item+" Doesn't exist in array");
			}
			sc.close();
		}

	}

}
