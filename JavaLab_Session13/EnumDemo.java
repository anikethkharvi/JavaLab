enum Color {
    RED, GREEN, BLUE;
}

class EnumDemo {
    public static void main(String args[]) {

        Color c1;  // Declare a variable of type Color
        c1 = Color.RED;  // Assign an enum constant
        System.out.println("Color is: " + c1);

        // Display all constants using values()

        Color allColors[] = Color.values();
        System.out.println("\nAll Colors:");
        for (Color c : allColors)
            System.out.println(c);

        // Use valueOf() to convert a string to enum constant

        Color c2 = Color.valueOf("BLUE");
        System.out.println("\nColor from valueOf(): " + c2);
    }
}
