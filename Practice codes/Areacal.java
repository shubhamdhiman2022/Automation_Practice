import java.util.Scanner;
public class Areacal implements Areacalc {
	
	Scanner sc= new Scanner(System.in);
	double r= sc.nextDouble();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the radius");
		Areacal arr= new Areacal();
		arr.circle();
	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		double area = 3.14*r*r;
		System.out.println(area);
		
		
	}

}
