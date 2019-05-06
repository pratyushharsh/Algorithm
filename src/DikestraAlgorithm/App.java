package DikestraAlgorithm;

public class App {

    public static void main(String[] args) {

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");

        a.addNeighbour(new Edge(1, a, b));
        a.addNeighbour(new Edge(3, a, c));
        a.addNeighbour(new Edge(6, a, d));
        b.addNeighbour(new Edge(1, b, c));

        DikestraAlgorithm da = new DikestraAlgorithm();
        da.computePath(a);

        System.out.println(da.getShortestPath(c));
    }
}
