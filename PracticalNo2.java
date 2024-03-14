import java.util.Scanner;

public class PracticalNo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // to get radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();



        // condition to check radius is less or = zero
        if (radius <= 0) {

            System.out.println("Please enter a non-zero positive number for the radius.");


        } else {
           
            double perimeter = 2 * Math.PI * radius;

             
            System.out.println("Perimeter of the circle: " + perimeter);

            System.out.println("Radius of the circle: " + radius);
        }

         // Close the scanner
        scanner.close(); 
    }
}
