package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
    private GeographicPoint start;
    private GeographicPoint end;
    private String streetType;
    private String streetName;
    private double distance;

    public MapEdge() {
    }

    public MapEdge(GeographicPoint start, GeographicPoint end, String streetType, String streetName, double distance) {
        this.start = start;
        this.end = end;
        this.streetType = streetType;
        this.streetName = streetName;
        this.distance = distance;
    }

    public GeographicPoint getStart() {
        return start;
    }

    public void setStart(GeographicPoint start) {
        this.start = start;
    }

    public GeographicPoint getEnd() {
        return end;
    }

    public void setEnd(GeographicPoint end) {
        this.end = end;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
