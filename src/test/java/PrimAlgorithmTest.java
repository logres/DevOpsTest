package src.test.java;
import org.junit.Test;

import src.main.java.PrimAlgorithm;

import static org.junit.Assert.*;

public class PrimAlgorithmTest {
    @Test
    public void testPrim() {
        int[][] graph1 = new int[][]{
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0},
        };
        int totalWeight1 = PrimAlgorithm.prim(graph1);
        assertEquals(10, totalWeight1);

        int[][] graph2 = new int[][]{
            {0, 1, 2, 3, 4},
            {1, 0, 5, 6, 7},
            {2, 5, 0, 8, 9},
            {3, 6, 8, 0, 10},
            {4, 7, 9, 10, 0},
        };
        int totalWeight2 = PrimAlgorithm.prim(graph2);
        assertEquals(6, totalWeight2);

        int[][] graph3 = new int[][]{
            {0, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
            {1, 0, 1, Integer.MAX_VALUE, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, 1, 0, 1, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, 1, 0, 1},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 1, 0},
        };
        int totalWeight3 = PrimAlgorithm.prim(graph3);
        assertEquals(3, totalWeight3);
    }
}
