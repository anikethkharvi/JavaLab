public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        int a = 5;
        Integer i = a; // autoboxing
        int b = i;     // unboxing

        System.out.println("a = " + a);
        System.out.println("i = " + i);
        System.out.println("b = " + b);
    }
}
