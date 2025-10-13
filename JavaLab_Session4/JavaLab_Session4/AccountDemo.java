// Demonstrates Polymorphism and Abstract Classes in Java

// Abstract base class
abstract class Account {
    String accHolderName;
    double balance;

    // Constructor
    Account(String accHolderName, double balance) {
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    // Abstract method (to be implemented by child classes)
    abstract void calculateInterest();

    // Concrete method (common for all accounts)
    void displayBalance() {
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Derived class: SavingsAccount
class SavingsAccount extends Account {
    double interestRate = 0.05; // 5% annual interest

    SavingsAccount(String accHolderName, double balance) {
        super(accHolderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("💰 Interest (Savings Account): ₹" + interest);
    }
}

// Derived class: CurrentAccount
class CurrentAccount extends Account {
    double serviceCharge = 500; // Fixed monthly charge

    CurrentAccount(String accHolderName, double balance) {
        super(accHolderName, balance);
    }

    @Override
    void calculateInterest() {
        balance -= serviceCharge;
        System.out.println("💸 Service Charge (Current Account): ₹" + serviceCharge);
    }
}

// Driver class
public class AccountDemo {
    public static void main(String[] args) {
        // Polymorphism: Parent reference → Child object
        Account acc1 = new SavingsAccount("Abhimanyu Kotari", 10000);
        Account acc2 = new CurrentAccount("Rohan Mehta", 20000);

        System.out.println("=== Savings Account Details ===");
        acc1.displayBalance();
        acc1.calculateInterest();
        acc1.displayBalance();

        System.out.println("\n=== Current Account Details ===");
        acc2.displayBalance();
        acc2.calculateInterest();
        acc2.displayBalance();
    }
}
