// User class implementing Runnable to represent a printing user
public class User implements Runnable {
    private String userName;
    private Printer printer;
    private int pages;

    // Constructor
    public User(String userName, Printer printer, int pages) {
        this.userName = userName;
        this.printer = printer;
        this.pages = pages;
    }

    // run() method executed by thread
    @Override
    public void run() {
        printer.printDocument(userName, pages);
    }
}
