// BankAccount class demonstrating exception handling
public class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Withdrawal method which may throw custom exception
    public void withdraw(double amount) throws LowBalanceException {
        System.out.println("\nProcessing withdrawal of ₹" + amount + "...");
        
        if (amount > balance) {
            throw new LowBalanceException("Insufficient funds! Withdrawal denied.");
        } else if (balance - amount < 1000) {  // Maintain minimum balance
            throw new LowBalanceException("Low balance! Minimum ₹1000 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawal successful! Remaining balance: ₹" + balance);
        }
    }

    // Display account details
    public void displayBalance() {
        System.out.println("👤 Account Holder: " + accountHolder);
        System.out.println("💰 Current Balance: ₹" + balance);
    }
}

