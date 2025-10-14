enum Day {
    MONDAY(false), TUESDAY(false), WEDNESDAY(false),
    THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);

    private boolean isHoliday;

    Day(boolean holiday) {
        isHoliday = holiday;
    }

    boolean isHoliday() {
        return isHoliday;
    }
}

class EnumWeekEnhanced {
    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d + " → Holiday: " + d.isHoliday());
        }

        Day day = Day.valueOf("SUNDAY");
        System.out.println("\nIs " + day + " a holiday? " + day.isHoliday());
    }
}
