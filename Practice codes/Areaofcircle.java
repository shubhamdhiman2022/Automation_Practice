import java.util.Scanner;
public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		double area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter radius of circle");
		r= sc.nextDouble();
		area= 3.15*r*r;
		System.out.println("Area of circle: "+ area );
		sc.close();

	}

}
