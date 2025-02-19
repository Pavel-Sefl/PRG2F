package algprg;

import java.util.ArrayList;
import java.util.List;

public class matrixPathfinding {
    public static void main(String[] args) {
        
    }

    class Vertex {
        private List<Vertex> neighbours = new ArrayList<>();

        public void addNeighbour(Vertex neighbour) {
            neighbours.add(neighbour);
        }
    }
}
