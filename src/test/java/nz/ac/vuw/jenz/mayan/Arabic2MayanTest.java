package nz.ac.vuw.jenz.mayan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test number conversion.
 * @author jens dietrich
 */
public class Arabic2MayanTest {

    // test number of digits
    @Test
    public void testDigitCount1() {assertEquals(1, Arabic2Mayan.calcNumberOfDigits(1));}

    @Test
    public void testDigitCount2() {assertEquals(1, Arabic2Mayan.calcNumberOfDigits(2));}

    @Test
    public void testDigitCount19() {assertEquals(1, Arabic2Mayan.calcNumberOfDigits(19));}

    @Test
    public void testDigitCount20() {assertEquals(2, Arabic2Mayan.calcNumberOfDigits(20));}

    @Test
    public void testDigitCount399() {assertEquals(2, Arabic2Mayan.calcNumberOfDigits(399));}

    @Test
    public void testDigitCount400() {assertEquals(3, Arabic2Mayan.calcNumberOfDigits(400));}

    // test digits
    @Test
    public void test0AsDigit() {
        assertEquals("0", Arabic2Mayan.convertDigit(0));
    }
    @Test
    public void test1AsDigit() {
        assertEquals("*", Arabic2Mayan.convertDigit(1));
    }
    @Test
    public void test2AsDigit() {
        assertEquals("**", Arabic2Mayan.convertDigit(2));
    }
    @Test
    public void test3AsDigit() {
        assertEquals("***", Arabic2Mayan.convertDigit(3));
    }
    @Test
    public void test4AsDigit() {
        assertEquals("****", Arabic2Mayan.convertDigit(4));
    }
    @Test
    public void test5AsDigit() {
        assertEquals("|", Arabic2Mayan.convertDigit(5));
    }
    @Test
    public void test6AsDigit() {
        assertEquals("*|", Arabic2Mayan.convertDigit(6));
    }
    @Test
    public void test7AsDigit() {
        assertEquals("**|", Arabic2Mayan.convertDigit(7));
    }
    @Test
    public void test8AsDigit() {
        assertEquals("***|", Arabic2Mayan.convertDigit(8));
    }
    @Test
    public void test9AsDigit() {
        assertEquals("****|", Arabic2Mayan.convertDigit(9));
    }
    @Test
    public void test10AsDigit() {
        assertEquals("||", Arabic2Mayan.convertDigit(10));
    }
    @Test
    public void test11AsDigit() {
        assertEquals("*||", Arabic2Mayan.convertDigit(11));
    }
    @Test
    public void test12AsDigit() {
        assertEquals("**||", Arabic2Mayan.convertDigit(12));
    }
    @Test
    public void test13AsDigit() {
        assertEquals("***||", Arabic2Mayan.convertDigit(13));
    }
    @Test
    public void test14AsDigit() {
        assertEquals("****||", Arabic2Mayan.convertDigit(14));
    }
    @Test
    public void test15AsDigit() {
        assertEquals("|||", Arabic2Mayan.convertDigit(15));
    }
    @Test
    public void test16AsDigit() {
        assertEquals("*|||", Arabic2Mayan.convertDigit(16));
    }
    @Test
    public void test17AsDigit() {
        assertEquals("**|||", Arabic2Mayan.convertDigit(17));
    }
    @Test
    public void test18AsDigit() {
        assertEquals("***|||", Arabic2Mayan.convertDigit(18));
    }
    @Test
    public void test19AsDigit() {
        assertEquals("****|||", Arabic2Mayan.convertDigit(19));
    }

    // outside scope tests
    @Test
    public void testM1() {
        assertThrows(IllegalArgumentException.class,()-> Arabic2Mayan.convertDigit(-1));
    }

    @Test
    public void test20AsDigit() {
        assertThrows(IllegalArgumentException.class,()-> Arabic2Mayan.convertDigit(20));
    }


    @Test
    public void test0() {
        assertEquals("0", Arabic2Mayan.convert(0));
    }
    @Test
    public void test1() {
        assertEquals("*", Arabic2Mayan.convert(1));
    }
    @Test
    public void test2() {
        assertEquals("**", Arabic2Mayan.convert(2));
    }
    @Test
    public void test3() {
        assertEquals("***", Arabic2Mayan.convert(3));
    }
    @Test
    public void test4() {
        assertEquals("****", Arabic2Mayan.convert(4));
    }
    @Test
    public void test5() {
        assertEquals("|", Arabic2Mayan.convert(5));
    }
    @Test
    public void test6() {
        assertEquals("*|", Arabic2Mayan.convert(6));
    }
    @Test
    public void test7() {
        assertEquals("**|", Arabic2Mayan.convert(7));
    }
    @Test
    public void test8() {
        assertEquals("***|", Arabic2Mayan.convert(8));
    }
    @Test
    public void test9() {
        assertEquals("****|", Arabic2Mayan.convert(9));
    }
    @Test
    public void test10() {
        assertEquals("||", Arabic2Mayan.convert(10));
    }
    @Test
    public void test11() {
        assertEquals("*||", Arabic2Mayan.convert(11));
    }
    @Test
    public void test12() {
        assertEquals("**||", Arabic2Mayan.convert(12));
    }
    @Test
    public void test13() {
        assertEquals("***||", Arabic2Mayan.convert(13));
    }
    @Test
    public void test14() {
        assertEquals("****||", Arabic2Mayan.convert(14));
    }
    @Test
    public void test15() {
        assertEquals("|||", Arabic2Mayan.convert(15));
    }
    @Test
    public void test16() {
        assertEquals("*|||", Arabic2Mayan.convert(16));
    }
    @Test
    public void test17() {
        assertEquals("**|||", Arabic2Mayan.convert(17));
    }
    @Test
    public void test18() {
        assertEquals("***|||", Arabic2Mayan.convert(18));
    }
    @Test
    public void test19() {
        assertEquals("****|||", Arabic2Mayan.convert(19));
    }

    @Test
    public void test20() {
        assertEquals("*_0", Arabic2Mayan.convert(20));
    }

    @Test
    public void test21() {assertEquals("*_*", Arabic2Mayan.convert(21));}

    @Test
    public void test22() {assertEquals("*_**", Arabic2Mayan.convert(22));}

    @Test
    public void test27() {assertEquals("*_**|", Arabic2Mayan.convert(27));}

    @Test
    public void test47() {assertEquals("**_**|", Arabic2Mayan.convert(47));}

    @Test
    public void test121() {assertEquals("*|_*", Arabic2Mayan.convert(121));}

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
