package test;
import main.Reina;
import main.Rey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
public class TestRey {
    private Rey rey = new Rey();


    @Test
    public void testCase1() {
        Integer n = 4;
        Integer k = 0;
        Integer r_q = 4;
        Integer c_q = 4;
        Integer expected = 3;
        Integer result = rey.MovimientoRey(n, k, r_q, c_q, null);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        Integer n = 4;
        Integer k = 0;
        Integer r_q = 3;
        Integer c_q = 2;
        Integer expected = 8;
        Integer result = rey.MovimientoRey(n, k, r_q, c_q, null);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        Integer n = 1;
        Integer k = 0;
        Integer r_q = 1;
        Integer c_q = 1;
        Integer expected = 0;
        Integer result = rey.MovimientoRey(n, k, r_q, c_q, null);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase4() {
        Integer n = 8;
        Integer k = 3;
        Integer r_q = 6;
        Integer c_q = 3;
        List<List<Integer>> obstacles = Arrays.asList(Arrays.asList(5,2), Arrays.asList(2,6), Arrays.asList(4,7));
        Integer expected = 7;
        Integer result = rey.MovimientoRey(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expected, result);
    }



}
