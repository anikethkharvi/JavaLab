// An enumeration of traffic light colors
enum TrafficLight {
    RED(30), GREEN(45), YELLOW(5);

    private int duration;  // duration of light in seconds

    // Constructor
    TrafficLight(int sec) {
        duration = sec;
    }

    int getDuration() {
        return duration;
    }
}

class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLight signal;

        signal = TrafficLight.RED;
        System.out.println("Current Signal: " + signal);
        System.out.println("Duration: " + signal.getDuration() + " seconds\n");

        // Display all signals with their durations
        System.out.println("All traffic lights:");
        for (TrafficLight t : TrafficLight.values())
            System.out.println(t + " → " + t.getDuration() + " seconds");

        // Convert string to enum constant using valueOf()
        TrafficLight next = TrafficLight.valueOf("GREEN");
        System.out.println("\nNext Signal: " + next + " (" + next.getDuration() + " seconds)");
    }
}
