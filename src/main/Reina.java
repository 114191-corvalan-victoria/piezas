package main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Reina {
    public Integer MovimientoReina(Integer n, Integer k, Integer r_q, Integer c_q, List<List<Integer>> obstacles) {

        int count = 0;
        Set<String> obstacleSet = new HashSet<>();

        if (obstacles != null) {
            for (List<Integer> obstacle : obstacles) {
                obstacleSet.add(obstacle.get(0) + "," + obstacle.get(1));
            }
        }

        int[][] movement = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        for (int[] dir : movement) {
            int r = r_q + dir[0];
            int c = c_q + dir[1];
            while (r >= 1 && r <= n && c >= 1 && c <= n) {
                String position = r + "," + c;
                if (obstacleSet.contains(position)) {
                    break;
                } else {
                    count++;
                }
                r += dir[0];
                c += dir[1];
            }
        }
        System.out.println(count);
        return count;

    }
}
