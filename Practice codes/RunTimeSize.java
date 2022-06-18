package ArrayDemos;

import java.util.Scanner;

public class RunTimeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int[] arr;
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an array");
		size=s.nextInt();
		arr=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[i+1])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//Max nO
		System.out.println(arr[size-1]);
		//Min No
		System.out.println(arr[0]);
	}

}
