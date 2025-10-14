enum Color {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    private int rgb;  // Field to hold RGB value

    // Constructor
    Color(int rgbCode) {
        rgb = rgbCode;
    }

    // Method to return RGB value
    int getRGB() {
        return rgb;
    }
}

class EnumDemo2 {
    public static void main(String args[]) {
        for (Color c : Color.values())
            System.out.println(c + " has RGB code: " + c.getRGB());
    }
}
