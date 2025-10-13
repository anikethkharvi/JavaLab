// Shared Printer class
public class Printer {

    // Synchronized method ensures only one thread prints at a time
    public synchronized void printDocument(String userName, int pages) {
        System.out.println("\n🖨️ " + userName + " started printing (" + pages + " pages).");

        for (int i = 1; i <= pages; i++) {
            System.out.println("   Printing page " + i + " of " + pages + " for " + userName);
            try {
                Thread.sleep(500); // Simulate time delay per page
            } catch (InterruptedException e) {
                System.out.println("⚠️ Printing interrupted for " + userName);
            }
        }

        System.out.println("✅ " + userName + " finished printing!\n");
    }
}
