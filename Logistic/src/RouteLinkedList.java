
public class RouteLinkedList<T extends Checkpoint> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int size;

    public void addCheckpoint(T checkpoint) {
        if (checkpoint == null) throw new IllegalArgumentException("Checkpoint cannot be null.");
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        size++;
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null || checkpointId == null) return false;
        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.getCheckpointId().equals(checkpointId)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.getCheckpointId().equals(checkpointId)) return current.data;
            current = current.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0.0;
        for (Node<T> current = head; current != null; current = current.next)
            total += current.data.getDistanceFromLast();
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0.0;
        for (Node<T> current = head; current != null; current = current.next)
            total += current.data.calculatePenalty();
        return total;
    }

    public void printRoute() {
        int index = 1;
        for (Node<T> current = head; current != null; current = current.next)
            System.out.printf("  %d. %s%n", index++, current.data);
    }

    public boolean isConsistentRoute() {
        boolean hasDelivery = false;
        boolean hasFuel = false;
        for (Node<T> current = head; current != null; current = current.next) {
            if (!current.data.isCritical()) continue;
            if (current.data.getType().equals("DeliveryCheckpoint")) hasDelivery = true;
            if (current.data.getType().equals("FuelCheckpoint"))     hasFuel = true;
        }
        return hasDelivery && hasFuel;
    }

    public int getSize()    { return size; }
    public boolean isEmpty(){ return head == null; }
}