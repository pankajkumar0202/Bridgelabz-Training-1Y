
public class Driver {

    private final String driverId;
    private final String name;
    private final RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public String getDriverId()                           { return driverId; }
    public String getName()                               { return name; }
    public RouteLinkedList<Checkpoint> getRouteHistory()  { return routeHistory; }

    public double getRouteScore() {
        return routeHistory.computeTotalDistance() - routeHistory.computeTotalPenalty();
    }

    public void printRouteSummary() {
        System.out.printf("Driver: %s – %s%n", driverId, name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();
        System.out.printf("Total Distance: %.1f km%n", routeHistory.computeTotalDistance());
        System.out.printf("Total Penalty: %.1f%n", routeHistory.computeTotalPenalty());
        System.out.printf("Route Score: %.1f%n", getRouteScore());
        System.out.println("Critical Route Check: " + (routeHistory.isConsistentRoute()
                ? "All required checkpoints present"
                : "MISSING critical checkpoints – route invalid"));
    }
}