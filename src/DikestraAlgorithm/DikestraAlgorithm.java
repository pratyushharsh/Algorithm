package DikestraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DikestraAlgorithm {

    public void computePath(Vertex sourceVertex) {

        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();

        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {

            Vertex currentVertex = priorityQueue.poll();

            for (Edge e: currentVertex.getAdjacentList()) {
                Vertex v = e.getTargetVertex();
                double d = currentVertex.getDistance() + e.getWeight();
                if (v.getDistance() > d) {
                    v.setDistance(d);
                    v.setPredecessor(currentVertex);
                    priorityQueue.add(v);
                }
            }
        }

    }

    public List<Vertex> getShortestPath(Vertex vertex) {
        List<Vertex> result = new ArrayList<Vertex>();

        for (Vertex v = vertex; v != null; v = v.getPredecessor()) {
            result.add(v);
        }

        Collections.reverse(result);

        return result;
    }

}
