import java.util.Scanner;

public class ComputeAreawithinput{
    public static void main(String[] args) {
        // Create the scanner object
        Scanner input = new Scanner(System.in);
        // promt user to enter the input
        System.out.println("Enter a number for radius : ");
        double radius = input.nextDouble();
        // Compute area
        double area = 3.14 * radius * radius;
        System.out.println("The area of radius " + radius + " is " + area);
    }
}