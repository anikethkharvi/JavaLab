import java.util.ArrayList;

public class AutoBoxingWithCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Autoboxing — int is converted to Integer
        list.add(10);
        list.add(20);
        list.add(30);

        // Unboxing — Integer is converted to int
        for (int n : list) {
            System.out.println(n);
        }
    }
}
