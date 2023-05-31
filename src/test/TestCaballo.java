package test;

import main.Caballo;
import main.Reina;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
public class TestCaballo {
    private Caballo caballo = new Caballo();

    @Test
    public void testCase1() {
        Integer n = 4;
        Integer k = 0;
        Integer r_q = 4;
        Integer c_q = 4;
        Integer expected = 3;
        Integer result = caballo.MovimientoCaballo(n, k, r_q, c_q, null);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        Integer n = 6;
        Integer k = 0;
        Integer r_q = 4;
        Integer c_q = 3;
        Integer expected = 8;
        Integer result = caballo.MovimientoCaballo(n, k, r_q, c_q, null);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        Integer n = 6;
        Integer k = 2;
        Integer r_q = 4;
        Integer c_q = 3;
        Integer expected = 7;
        List<List<Integer>> obstacles = Arrays.asList(Arrays.asList(6,3), Arrays.asList(2,4));
        Integer result = caballo.MovimientoCaballo(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expected, result);
    }

}
