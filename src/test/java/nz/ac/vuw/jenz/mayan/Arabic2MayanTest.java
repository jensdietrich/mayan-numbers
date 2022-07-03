package nz.ac.vuw.jenz.mayan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test number conversion.
 * @author jens dietrich
 */
public class Arabic2MayanTest {

    // test digits
    @Test
    public void test0() {
        assertEquals("0", Arabic2Mayan.convertDigit(0));
    }
    @Test
    public void test1() {
        assertEquals("*", Arabic2Mayan.convertDigit(1));
    }
    @Test
    public void test2() {
        assertEquals("**", Arabic2Mayan.convertDigit(2));
    }
    @Test
    public void test3() {
        assertEquals("***", Arabic2Mayan.convertDigit(3));
    }
    @Test
    public void test4() {
        assertEquals("****", Arabic2Mayan.convertDigit(4));
    }
    @Test
    public void test5() {
        assertEquals("|", Arabic2Mayan.convertDigit(5));
    }
    @Test
    public void test6() {
        assertEquals("*|", Arabic2Mayan.convertDigit(6));
    }
    @Test
    public void test7() {
        assertEquals("**|", Arabic2Mayan.convertDigit(7));
    }
    @Test
    public void test8() {
        assertEquals("***|", Arabic2Mayan.convertDigit(8));
    }
    @Test
    public void test9() {
        assertEquals("****|", Arabic2Mayan.convertDigit(9));
    }
    @Test
    public void test10() {
        assertEquals("||", Arabic2Mayan.convertDigit(10));
    }
    @Test
    public void test11() {
        assertEquals("*||", Arabic2Mayan.convertDigit(11));
    }
    @Test
    public void test12() {
        assertEquals("**||", Arabic2Mayan.convertDigit(12));
    }
    @Test
    public void test13() {
        assertEquals("***||", Arabic2Mayan.convertDigit(13));
    }
    @Test
    public void test14() {
        assertEquals("****||", Arabic2Mayan.convertDigit(14));
    }
    @Test
    public void test15() {
        assertEquals("|||", Arabic2Mayan.convertDigit(15));
    }
    @Test
    public void test16() {
        assertEquals("*|||", Arabic2Mayan.convertDigit(16));
    }
    @Test
    public void test17() {
        assertEquals("**|||", Arabic2Mayan.convertDigit(17));
    }
    @Test
    public void test18() {
        assertEquals("***|||", Arabic2Mayan.convertDigit(18));
    }
    @Test
    public void test19() {
        assertEquals("****|||", Arabic2Mayan.convertDigit(19));
    }

    // outside scope tests
    @Test
    public void testM1() {
        assertThrows(IllegalArgumentException.class,()-> Arabic2Mayan.convertDigit(-1));
    }
    @Test
    public void test20() {
        assertThrows(IllegalArgumentException.class,()-> Arabic2Mayan.convertDigit(20));
    }

    // multi-digit numbers
    @Test
    public void test6043() {
        assertEquals("|||_**_***", Arabic2Mayan.convert(6043));
    }

    @Test
    public void test6003() {
        assertEquals("|||_0_***", Arabic2Mayan.convert(6003));
    }
    @Test
    public void test2808() {
        assertEquals("**|_0_***|", Arabic2Mayan.convert(2808));
    }
    @Test
    public void test2813() {
        assertEquals("**|_0_***||", Arabic2Mayan.convert(2813));
    }
    @Test
    public void test2840() {
        assertEquals("**|_**_0", Arabic2Mayan.convert(2840));
    }
}
