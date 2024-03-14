import java.util.Scanner;

public class PracticalNo3 {

    public static double cubeVolume(double side) {
        return side * side * side;
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double boxVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the cube:");
        double side = scanner.nextDouble();
        System.out.println("Volume of the cube: " + cubeVolume(side));

        System.out.println("\nEnter the radius of the cylinder:");
        double radius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double height = scanner.nextDouble();
        System.out.println("Volume of the cylinder: " + cylinderVolume(radius, height));

        System.out.println("\nEnter the length of the box:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the box:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the box:");
        double boxHeight = scanner.nextDouble();
        System.out.println("Volume of the box: " + boxVolume(length, width, boxHeight));

        scanner.close();
    }
}
