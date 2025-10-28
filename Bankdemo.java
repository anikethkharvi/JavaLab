// File: Bankdemo.java

class Account {
    int balance = 5000;

    void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is trying to withdraw " + amount);
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(name + " cannot withdraw " + amount + " (Insufficient Balance)");
        }
    }
}

class Customer implements Runnable {
    String name;
    Account account;
    int amount;
    Thread t;

    Customer(Account acc, String n, int amt) {
        account = acc;
        name = n;
        amount = amt;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

public class Bankdemo {
    public static void main(String[] args) {
        Account acc = new Account();
        Customer c1 = new Customer(acc, "Alice", 4000);
        Customer c2 = new Customer(acc, "Bob", 4000);

        try {
            c1.t.join();
            c2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}