
public class Error1{

    public static void main(String[] args) {
        // Variable declarations
        int x = 5;
        double y = 3.14;
        String message = "Hello, World!";

        // Displaying values
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The message is: " + message);

        // Error: Mismatched data types in calculation
        int result = x + y;

        // Displaying the result
        System.out.println("The result of the calculation is: " + result);
    }
}
