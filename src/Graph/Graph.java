package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Graph
 */
public class Graph<T> {

    // Storing Edge
    private Map<T, List<T>> map = new HashMap<>();

    public void addVertices(T v) {
        map.put(v, new LinkedList<>());
    }

    // Make this bidirectional later
    public void addEdge(T source, T destination, boolean bd) {
        if (!map.containsKey(source)) {
            addVertices(source);
        }

        if (!map.containsKey(destination)) {
            addVertices(destination);
        }

        map.get(source).add(destination);
        if(bd) map.get(destination).add(source);
    }

    public int getVerticesCount() {
        return map.keySet().size();
    }

    public int getEdgeCount(boolean bd) {
        int count = 0;
        for(T k: map.keySet())
            count += map.get(k).size();

        if (bd) count /= 2;

        return count;
    }

    public List<T> getEdges(T key) {
        return map.get(key);
    }
    
}