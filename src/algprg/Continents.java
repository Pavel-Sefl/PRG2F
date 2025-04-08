package algprg;

import java.util.HashMap;

public class Continents {
    public static void main(String[] args) {
        int[] standing = new int[2];
        standing[0] = 1;
        standing[1] = 3;

        byte[][] map = {
            {0,0,0,0,0},
            {0,0,1,1,0},
            {0,0,0,0,0},
            {0,1,1,0,0},
            {0,0,0,0,0}
        };

        HashMap<int[], Integer> islands = new HashMap<>();

        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map.length; y++) {
                /* Strategy
                * Go from 0;0. Got left -> right & top -> bottom.
                * When you encounter a land for the first time, start the island search.
                * Island search:
                *   Recursively go through all the tiles and their bottom and right neighbours.
                *   Every time you land on a neighbour, change it to a water tile.
                *   Count each land tile you see.
                *   After searching through the whole island, and it's the biggest you've seen yet, save its size.
                * */
                if (map[x][y] == 0) continue;

                // Explore island
                int size;
                int[] islandStart = new int[2];

                // find island start
                islandStart[0] = x;
                islandStart[1] = y;

                int neighborUp = map[x][(y-1)%map.length];
                int neighborLeft = map[(x-1)%map[x].length][y];



                // find island end


            }
        }
    }
}
