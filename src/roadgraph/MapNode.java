package roadgraph;

import geography.GeographicPoint;

import java.util.ArrayList;
import java.util.List;

public class MapNode {
    private GeographicPoint location;
    private List<MapEdge> mapEdges;

    public MapNode(GeographicPoint location) {
        this.location = location;
        mapEdges = new ArrayList<>(10);
    }

    public GeographicPoint getLocation() {
        return location;
    }

    public void setLocation(GeographicPoint location) {
        this.location = location;
    }

    public List<MapEdge> getMapEdges() {
        return mapEdges;
    }

    public void setMapEdges(List<MapEdge> mapEdges) {
        this.mapEdges = mapEdges;
    }

    public void addEdge(MapEdge mapEdge) {
        mapEdges.add(mapEdge);
    }

}
