import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightpounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightinches = input.nextDouble();

        double weightkg = weightpounds * 0.45359237;

        double heightmeters = heightinches * 0.0254;

        double bmi = weightkg / (heightmeters * heightmeters);

        System.out.println("BMI is : " + bmi);
    }
}
