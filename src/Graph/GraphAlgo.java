package Graph;

import java.util.*;

public class GraphAlgo<T> {

    public void bfs(Graph<T> g, T start) {
        Queue<T> q = new LinkedList<>();
        Set<T> visited = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        q.add(start);

        visited.add(start);
        while (q.peek() != null) {
            T head = q.peek();
            sb.append(head.toString() + " ");
            q.poll();
            for (T el: g.getEdges(head)) {
                if (!visited.contains(el)) {
                    visited.add(el);
                    q.add(el);
                }
            }
        }
        System.out.println(sb.toString());
    }

    public void dfs(Graph<T> g, T start) {
        Stack<T> stack = new Stack<>();
        Set<T> visited = new HashSet<>();
        stack.push(start);
        visited.add(start);

        StringBuilder builder = new StringBuilder();

        while (!stack.empty()) {
            T t = stack.pop();
            builder.append(t.toString() + " ");
            for (T egde: g.getEdges(t)) {
                if (!visited.contains(egde)) {
                    visited.add(egde);
                    stack.push(egde);
                }
            }
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        GraphAlgo<Integer> gs = new GraphAlgo<Integer>();
        Graph<Integer> g = new Graph<Integer>();

        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(2, 5, true);
        g.addEdge(2, 4, true);
        g.addEdge(4, 5, true);
        g.addEdge(4, 6, true);
        g.addEdge(6, 5, true);
        g.addEdge(3, 5, true);

        gs.bfs(g, 1 );
        gs.dfs(g, 1);
        // System.out.println(g.getEdgeCount(true));
    }
}