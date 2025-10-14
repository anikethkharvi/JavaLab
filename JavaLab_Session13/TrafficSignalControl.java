enum TrafficLight {
    RED(30), GREEN(45), YELLOW(5);
    private int duration;

    TrafficLight(int sec) { duration = sec; }
    int getDuration() { return duration; }

    // Return next signal
    TrafficLight next() {
        switch(this) {
            case RED: return GREEN;
            case GREEN: return YELLOW;
            case YELLOW: return RED;
        }
        return RED; // default
    }
}

class TrafficSignalControl {
    public static void main(String[] args) {
        TrafficLight signal = TrafficLight.RED;

        for (int i = 0; i < 3; i++) {
            System.out.println("Signal: " + signal + " → Duration: " + signal.getDuration() + " sec");
            signal = signal.next(); // move to next color
        }
    }
}
