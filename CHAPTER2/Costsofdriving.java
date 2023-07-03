import java.util.Scanner;

public class Costsofdriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance:");
        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon:");
        double milespergallon = input.nextDouble();

        System.out.println("Enter prices per gallon:");
        double pricespergallon = input.nextDouble();

        double COD = (distance / milespergallon) * pricespergallon;

        System.out.println("The cost of driving is: $" + COD);

    }
}
