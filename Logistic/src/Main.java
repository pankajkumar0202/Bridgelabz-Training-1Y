
public class Main {

    public static void main(String[] args) {

        System.out.println("=".repeat(55));
        System.out.println("       LOGISTIC ROUTE TRACKER – Route Summary");
        System.out.println("=".repeat(55));

        Driver kavita = new Driver("D1204", "Kavita Nair");
        RouteLinkedList<Checkpoint> route = kavita.getRouteHistory();

        route.addCheckpoint(new DeliveryCheckpoint("CP001", "Warehouse A", 30, 30, 40));
        route.addCheckpoint(new FuelCheckpoint    ("CP002", "Pump 12",     20, 15, 15));
        route.addCheckpoint(new RestCheckpoint    ("CP003", "Motel X",     30, 60, 65));
        route.addCheckpoint(new DeliveryCheckpoint("CP004", "Client Hub",  40, 20, 35));

        kavita.printRouteSummary();

        System.out.println();
        System.out.println("=".repeat(55));
        System.out.println("       DEMO 2 – Remove & Find Checkpoint");
        System.out.println("=".repeat(55));

        Driver ravi = new Driver("D0099", "Ravi Kumar");
        RouteLinkedList<Checkpoint> route2 = ravi.getRouteHistory();

        route2.addCheckpoint(new DeliveryCheckpoint("A1", "Depot North", 10, 20, 20));
        route2.addCheckpoint(new FuelCheckpoint    ("A2", "City Pump",   15, 10, 22));
        route2.addCheckpoint(new RestCheckpoint    ("A3", "Highway Inn", 20, 45, 120));
        route2.addCheckpoint(new DeliveryCheckpoint("A4", "South Mall",  25, 30, 50));

        System.out.println("\n[Before removal]");
        ravi.printRouteSummary();

        Checkpoint found = route2.findCheckpoint("A2");
        System.out.println("\n[findCheckpoint(\"A2\")] -> " + (found != null ? found : "Not found"));

        System.out.println("\n[removeCheckpoint(\"A3\")] -> "
                + (route2.removeCheckpoint("A3") ? "Removed" : "Not found"));

        System.out.println("\n[After removing RestCheckpoint A3]");
        ravi.printRouteSummary();

        route2.removeCheckpoint("A2");
        System.out.println("\n[After removing FuelCheckpoint A2 – consistency should fail]");
        ravi.printRouteSummary();

        System.out.println();
        System.out.println("=".repeat(55));
        System.out.println("  DEMO 3 – Generics: DeliveryCheckpoint-only list");
        System.out.println("=".repeat(55));

        RouteLinkedList<DeliveryCheckpoint> deliveryOnly = new RouteLinkedList<>();
        deliveryOnly.addCheckpoint(new DeliveryCheckpoint("D1", "Hub Alpha", 12, 15, 15));
        deliveryOnly.addCheckpoint(new DeliveryCheckpoint("D2", "Hub Beta",  18, 15, 30));
        deliveryOnly.addCheckpoint(new DeliveryCheckpoint("D3", "Hub Gamma", 22, 20, 20));

        System.out.println("\nDelivery-only route:");
        deliveryOnly.printRoute();
        System.out.printf("Total Distance : %.1f km%n", deliveryOnly.computeTotalDistance());
        System.out.printf("Total Penalty  : %.1f%n",    deliveryOnly.computeTotalPenalty());
        System.out.printf("Route Score    : %.1f%n",
                deliveryOnly.computeTotalDistance() - deliveryOnly.computeTotalPenalty());
    }
}