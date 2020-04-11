package Graph;

import java.util.*;

public class GraphAlgo<T> {

    public void bfs(Graph<T> g, T start) {
        Queue<T> q = new LinkedList<>();
        Set<T> visited = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        q.add(start);

        while (q.peek() != null) {
            T head = q.peek();
            visited.add(head);
            sb.append(head.toString() + " ");
            q.poll();
            for (T el: g.getEdges(head)) {
                if (!visited.contains(el)) q.add(el);
            }
        }
        System.out.println(sb.toString());
    }

    public void dfs(Graph<T> g) {

    }

    public static void main(String[] args) {
        GraphAlgo<Integer> gs = new GraphAlgo<Integer>();
        Graph<Integer> g = new Graph<>();

        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(3, 4, true);
        g.addEdge(2, 3, true);

        gs.bfs(g, 0);
        // System.out.println(g.getEdgeCount(true));
    }
}