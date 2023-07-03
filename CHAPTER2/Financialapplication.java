import java.util.Scanner;

public class Financialapplication {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double monthlyDeposit = scanner.nextDouble();
        
        double annualinterestrate = 0.05;
        double monthlyinterestrate = annualinterestrate / 12;
        double accountValue = 0.0;
        
        for (int i = 1; i <= 6; i++) {
            accountValue = (accountValue + monthlyDeposit) * (1 + monthlyinterestrate);
        }
        
        System.out.println("After the sixth month, the account value is: $" + accountValue);

    }
}
