import java.util.Scanner;

public class Areaofhexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");

        double sideLength = input.nextDouble();

        double area = (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;

        System.out.println("The area of the hexagon is: " + area);

    }

}
