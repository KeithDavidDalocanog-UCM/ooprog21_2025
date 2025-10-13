// A Trip has three constructors
// When one argument is passed,
// it is the trip destination
// When two arguments are passed,
// they are the destination and departure cities
// When three arguments are passed,
// the last one is the mode of transportation for the trip

public class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    // One-argument constructor
    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    // Two-argument constructor
    public DebugTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE);
    }

    // Three-argument constructor
    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departure;
    }

    public String getMode() {
        return mode;
    }
    
    public static void main(String[] args) {
        DebugTrip trip1 = new DebugTrip("New York");
        DebugTrip trip2 = new DebugTrip("Paris", "London");
        DebugTrip trip3 = new DebugTrip("Tokyo", "Osaka", "train");

        System.out.println(trip1.getDestination() + " from " +
                           trip1.getDepartureCity() + " by " + trip1.getMode());
        System.out.println(trip2.getDestination() + " from " +
                           trip2.getDepartureCity() + " by " + trip2.getMode());
        System.out.println(trip3.getDestination() + " from " +
                           trip3.getDepartureCity() + " by " + trip3.getMode());
    }
}
