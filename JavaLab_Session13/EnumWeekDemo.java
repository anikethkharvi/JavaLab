// Declare an enumeration for days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class EnumWeekDemo {
    public static void main(String[] args) {

        // Assign a value to enum variable
        Day d1 = Day.FRIDAY;
        System.out.println("Today is: " + d1);

        // Display all days using values()
        System.out.println("\nAll days of the week:");
        for (Day d : Day.values())
            System.out.println(d);

        // Convert string to enum constant using valueOf()
        Day d2 = Day.valueOf("MONDAY");
        System.out.println("\nConverted from String: " + d2);
    }
}
