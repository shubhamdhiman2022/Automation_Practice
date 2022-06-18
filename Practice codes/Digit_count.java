import java.util.Scanner;

public class Digit_count {

	public static void main(String[] args) {
		
		long num,count=0;
		Scanner sc= new Scanner(System.in);
		num= sc.nextLong();
		long number= num;
		while(num!=0)
		{
			num= num/10;
			count++;
		}
		System.out.println(count+" digits are in number: "+number);
	}

}
