package Abstraction;

public interface InterfaceDiscount extends StudentDetails {
void discount();
static void dis()
{
	System.out.println("Discount Offer");
}
default void acc()
{
	System.out.println("Default Method");
}
}
