// Importing the custom package
import edu.bank.*;

public class BankDemo {
    public static void main(String[] args) {
        // Using interface reference for polymorphism
        Loan loan;

        System.out.println("=== 🏦 Banking Loan System ===");

        loan = new HomeLoan();
        loan.displayLoanDetails();
        loan.calculateEMI(500000, 10);

        System.out.println("--------------------------------");

        loan = new CarLoan();
        loan.displayLoanDetails();
        loan.calculateEMI(300000, 5);
    }
}
