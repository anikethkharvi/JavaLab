public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Inside thread...");
        });

        System.out.println("State before start: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());

        t.join(); // wait for thread to finish
        System.out.println("State after completion: " + t.getState());
    }
}
