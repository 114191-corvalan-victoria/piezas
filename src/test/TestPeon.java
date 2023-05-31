package test;

import main.Peon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
public class TestPeon {
    private Peon peon = new Peon();

    @Test
    public void testCase1() {
        Integer n = 4;
        Integer k = 0;
        Integer r_q = 4;
        Integer c_q = 4;
        Integer expected = 0;
        Integer result = peon.MovimientoPeon(n, k, r_q, c_q, null);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        Integer n = 5;
        Integer k = 3;
        Integer r_q = 4;
        Integer c_q = 3;
        List<List<Integer>> obstacles = Arrays.asList(Arrays.asList(5,5), Arrays.asList(4,2), Arrays.asList(2,3));
        Integer expected = 1;
        Integer result = peon.MovimientoPeon(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        Integer n = 8;
        Integer k = 1;
        Integer r_q = 1;
        Integer c_q = 1;
        List<List<Integer>> obstacles = Arrays.asList(Arrays.asList(2,1));
        Integer expected = 0;
        Integer result = peon.MovimientoPeon(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase4() {
        Integer n = 8;
        Integer k = 1;
        Integer r_q = 2;
        Integer c_q = 4;
        List<List<Integer>> obstacles = Arrays.asList(Arrays.asList(8,4));
        Integer expected = 1;
        Integer result = peon.MovimientoPeon(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expected, result);
    }
}
