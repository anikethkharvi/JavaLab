enum Color { RED, GREEN, BLUE, RED1 }

class EnumSimple {
    public static void main(String[] args) {
    Color c = Color.GREEN;
        System.out.println("Selected color is : " + c);

    System.out.println("List all available colors:");
        for (Color i : Color.values())
            System.out.println(i);

    Color c2 = Color.valueOf("RED1");
        System.out.println("Converted from String: " + c2);
}
}




        
