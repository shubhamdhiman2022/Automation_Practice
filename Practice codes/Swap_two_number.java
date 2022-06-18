
public class Swap_two_number {

	public static void main(String[] args) {
		
		//with temp variable
		int x=134, y=243, temp;
		System.out.print("before swap:");
	    System.out.println("value of x: "+x+" value of y: "+y);
	    
	    temp=x;
	    x=y;
	    y=temp;
	    System.out.print("after swap:");
	    System.out.println("value of x: "+x+" value of y: "+y);
	    
	    
	    int a=734,b=234;
	    System.out.print("before swap:");
	    System.out.println("value of x: "+a+" value of y: "+b);
	    
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.print("After swap:");
	    System.out.println("value of x: "+a+" value of y: "+b);
	}
	
	

}
