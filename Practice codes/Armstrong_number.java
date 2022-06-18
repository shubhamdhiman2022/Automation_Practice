
public class Armstrong_number {

	public static void main(String[] args) {
		
		int num=1253, number, remainder,arm=0;
		number= num;
		while(num>0)
		{
			remainder= num%10;
			num= num/10;
			arm= arm+remainder*remainder*remainder;
		}
		if(arm==number)
		{
			System.out.println(number+" number is armstrong");
		}
		else
		{
			System.out.println(number+" number is not armstrong");
		}

	}

}
