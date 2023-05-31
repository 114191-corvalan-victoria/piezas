package test;
import main.Torre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
public class TestTorre {
    private Torre torre = new Torre();

    @Test
    public void testCase1() {
        Integer n = 4;
        Integer k = 0;
        Integer r_q = 4;
        Integer c_q = 4;
        Integer expected = 6;
        Integer result = torre.MovimientoTorre(n, k, r_q, c_q, null);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        Integer n = 5;
        Integer k = 3;
        Integer r_q = 4;
        Integer c_q = 3;
        List<List<Integer>> obstacles = Arrays.asList(Arrays.asList(5,5), Arrays.asList(4,2), Arrays.asList(2,3));
        Integer expected = 4;
        Integer result = torre.MovimientoTorre(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        Integer n = 1;
        Integer k = 0;
        Integer r_q = 1;
        Integer c_q = 1;
        Integer expected = 0;
        Integer result = torre.MovimientoTorre(n, k, r_q, c_q, null);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase4() {
        Integer n = 8;
        Integer k = 4;
        Integer r_q = 6;
        Integer c_q = 3;
        List<List<Integer>> obstacles = Arrays.asList(Arrays.asList(5,2), Arrays.asList(2,3), Arrays.asList(1,8), Arrays.asList(7,7));
        Integer expected = 12;
        Integer result = torre.MovimientoTorre(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase5() {
        Integer n = 8;
        Integer k = 8;
        Integer r_q = 4;
        Integer c_q = 4;
        List<List<Integer>> obstacles = Arrays.asList(Arrays.asList(1,1), Arrays.asList(4,1), Arrays.asList(7,1), Arrays.asList(8,4),
                Arrays.asList(1,4), Arrays.asList(1,7), Arrays.asList(4,8), Arrays.asList(8,8));
        Integer expected = 10;
        Integer result = torre.MovimientoTorre(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase6() {
        Integer n = 5;
        Integer k = 0;
        Integer r_q = 3;
        Integer c_q = 3;
        Integer expected = 8;
        Integer result = torre.MovimientoTorre(n, k, r_q, c_q,null);
        Assertions.assertEquals(expected, result);
    }

}
