import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int Year = input.nextInt();
        if (Year % 4 == 0) {
            System.out.println("this is a Leap Year");
        } else {
            System.out.println("this is not a Leap Year");
        }
    }
}