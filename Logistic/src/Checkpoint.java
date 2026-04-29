
public abstract class Checkpoint {

    protected String checkpointId;
    protected String locationName;
    protected double distanceFromLast;
    protected int expectedDuration;
    protected int actualDuration;

    public Checkpoint(String checkpointId, String locationName,
                      double distanceFromLast, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public String getCheckpointId()     { return checkpointId; }
    public String getLocationName()     { return locationName; }
    public double getDistanceFromLast() { return distanceFromLast; }
    public int getExpectedDuration()    { return expectedDuration; }
    public int getActualDuration()      { return actualDuration; }

    public abstract String getType();
    public abstract boolean isCritical();
    public abstract double calculatePenalty();

    public boolean isDelayed()    { return actualDuration > expectedDuration; }
    protected int delayMinutes()  { return Math.max(0, actualDuration - expectedDuration); }

    @Override
    public String toString() {
        return String.format("%s – %s – %s – Penalty: %.1f",
                getType(), locationName, isDelayed() ? "Delayed" : "On Time", calculatePenalty());
    }
}