public class CheckPointDetails {
    String checkpointId;
    String locationName;
    Double distanceFromLast;
    Double expectedDuration;
    Double actualDuration;

    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Double getDistanceFromLast() {
        return distanceFromLast;
    }

    public void setDistanceFromLast(Double distanceFromLast) {
        this.distanceFromLast = distanceFromLast;
    }

    public Double getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(Double expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public Double getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Double actualDuration) {
        this.actualDuration = actualDuration;
    }
}
