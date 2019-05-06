package DikestraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    private String name;
    private List<Edge> adjacentList;
    private boolean visited;
    private Vertex predecessor;
    private double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.adjacentList = new ArrayList<>();
    }

    @Override
    public int compareTo(Vertex anotherVertex) {
        return Double.compare(this.distance, anotherVertex.distance);
    }

    public void addNeighbour(Edge edge) {
        if (edge != null)
            this.adjacentList.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacentList() {
        return adjacentList;
    }

    public void setAdjacentList(List<Edge> adjacentList) {
        this.adjacentList = adjacentList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
