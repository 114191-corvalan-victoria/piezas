package main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Peon {
    public Integer MovimientoPeon(Integer n, Integer k, Integer r_q, Integer c_q, List<List<Integer>> obstacles) {
        int count = 0;
        Set<String> obstacleSet = new HashSet<>();

        if (obstacles != null) {
            for (List<Integer> obstacle : obstacles) {
                obstacleSet.add(obstacle.get(0) + "," + obstacle.get(1));
            }
        }

        int[][] movement = {{1, 0}};

        for (int[] dir : movement) {
            int r = r_q + dir[0];
            int c = c_q + dir[1];

            if (r >= 1 && r <= n && c >= 1 && c <= n && !obstacleSet.contains(r + "," + c)) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }
}
