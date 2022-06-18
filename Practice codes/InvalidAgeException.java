package ExceptionHandlingDemo;

public class InvalidAgeException extends Throwable {
	public InvalidAgeException()
	{
		System.out.println("Invalid age entered");
	}

}
