// Main class to simulate multiple users printing
public class PrintSimulation {
    public static void main(String[] args) {
        System.out.println("🏢 Office Print Queue Simulation Started...\n");

        // Shared printer object
        Printer sharedPrinter = new Printer();

        // Create user threads
        Thread user1 = new Thread(new User("Abhimanyu", sharedPrinter, 3));
        Thread user2 = new Thread(new User("Meera", sharedPrinter, 4));
        Thread user3 = new Thread(new User("Ravi", sharedPrinter, 2));

        // Start threads
        user1.start();
        user2.start();
        user3.start();
    }
}
