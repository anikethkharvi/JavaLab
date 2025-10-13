// Demonstration of exception handling (built-in + custom)
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount("Abhimanyu Kotari", 5000);
        acc.displayBalance();

        try {
            System.out.print("\nEnter amount to withdraw: ₹");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
        } 
        catch (InputMismatchException e) {
            System.out.println("❌ Invalid input! Please enter a numeric amount.");
        } 
        catch (LowBalanceException e) {
            System.out.println("⚠️ Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("\n✅ Transaction process completed.");
        }

        sc.close();
    }
}
