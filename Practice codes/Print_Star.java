
public class Print_Star {

	public static void main(String[] args) 
	{
		for(int i=0; i<5; i++)
		{
			for(int x=5-i; x>=0; x--) 
			{
				System.out.print(" ");
			}
			for(int a=0; a<=i; a++ ) 
			{
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
