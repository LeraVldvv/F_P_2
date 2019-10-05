package imperative

import org.junit.Test

import static imperative.PerfectNumber.State.ABUNDANT;
import static imperative.PerfectNumber.State.DEFICIENT;
import static imperative.PerfectNumber.State.PERFECT;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class PerfectNumberTest {

    @Test
    public void test6Perfect() {
        assertEquals(PERFECT, PerfectNumber.Process(6));
    }

    @Test
    public void test8Deficient() {
        assertEquals(DEFICIENT, PerfectNumber.Process(8));
    }

    @Test
    public void test20Abundant() {
        assertEquals(ABUNDANT, PerfectNumber.Process(20));
    }

    @Test
    public void test16DeficientWithIntSqrt() {
        assertEquals(DEFICIENT, PerfectNumber.Process(16));
    }

    @Test
    public void test1Deficient() {
        assertEquals(DEFICIENT, PerfectNumber.Process(1));
    }


}
