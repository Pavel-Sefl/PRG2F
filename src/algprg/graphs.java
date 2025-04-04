/*
package algprg;

import java.util.*;

public class graphs {
    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        a.paths.add(new Path(d, 2));
        a.paths.add(new Path(b, 9));

        b.paths.add(new Path(c, 5));
        b.paths.add(new Path(d, 3));

        c.paths.add(new Path(b, 5));

        d.paths.add(new Path(b, 3));
        d.paths.add(new Path(a, 2));

        e.paths.add(new Path(f, 2));
        f.paths.add(new Path(e, 2));

        List<Vertex> bfsResult = graph.bfs(a);
        for (Vertex v : bfsResult) {
            System.out.println(v);
        }
    }
}

class Graph {
    Set<Vertex> vertices = new HashSet<Vertex>();

    public List<Vertex> bfs(Vertex start) {
        List<Vertex> output = new ArrayList<>();
        List<Vertex> queue = new ArrayList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex curVertex = queue.removeLast();

            output.add(curVertex);

            for (Path path : curVertex.paths) {
                if (!output.contains(path.neighbor) && !queue.contains(path.neighbor)) {
                    queue.add(path.neighbor);
                }
            }
        }

        return output;
    }

    public List<Vertex> dfs(Vertex start) {
        List<Vertex> output = new ArrayList<>();
        List<Vertex> queue = new ArrayList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex curVertex = queue.removeLast();

            output.add(curVertex);

            for (Path path : curVertex.paths) {
                if (!output.contains(path.neighbor) && !queue.contains(path.neighbor)) {
                    queue.add(path.neighbor);
                }
            }
        }

        return output;
    }
}

class Vertex {
    Set<Path> paths = new HashSet<Path>();
    String name;

    Vertex(String vertexName) {
        this.name = vertexName;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Path {
    Vertex neighbor;
    int cost;

    Path(Vertex destination, int pathCost) {
        this.neighbor = destination;
        this.cost = pathCost;
    }
}
*/