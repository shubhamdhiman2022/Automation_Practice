package Abstraction;

public class StudentDemo extends Cow implements InterfaceDiscount {
int rollno;
String name,Course;
double fee;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo oo=new StudentDemo();
		oo.perdet();
		oo.coursedet();
		oo.newMethod();
		InterfaceDiscount.dis();//calling static concrete method of an interface
		oo.acc();//Calling default concrete method of an interface
		
	}

	@Override
	public void perdet() {
		// TODO Auto-generated method stub
		System.out.println("Enter Roolno of Student");
		rollno=s.nextInt();
		
		System.out.println("Enter name ");
		name=s.next();
		eat();
		
		
		//System.out.println(a);
	}

	@Override
	public void coursedet() {
		// TODO Auto-generated method stub
		System.out.println("Enter name of Course");
		Course=s.next();
	}

	@Override        
	public void feedet() {
		// TODO Auto-generated method stub
		System.out.println("Enter Fee Details");
		fee=s.nextDouble();
	}
	public void newMethod()
	{
		System.out.println("Method of this class");
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("Discount");
	}

}
