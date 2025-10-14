// int is a primitive.
// Integer is its wrapper object.
// intValue() extracts the primitive value from the wrapper.

class WrapDemo {
    public static void main(String args[]) {
        Integer iOb = Integer.valueOf(100);
        int i = iOb.intValue();

        System.out.println(i + " " + iOb); 
    }
}
