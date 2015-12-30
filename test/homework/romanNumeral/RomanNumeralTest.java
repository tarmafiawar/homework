package homework.romanNumeral;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by taro on 11/24/15.
 */
public class RomanNumeralTest {

    private RomanNumeralConversion rn;

//    @Before
//    public void setUp(){
//        rnc = new RomanNumeralConversion();
//    }

    @Test
    public void when1ThenReturnI(){
        assertRoman("I", 1);
    }

    @Test
    public void when3ThenReturnIII() {
        assertRoman("III", 3);
    }

    @Test
    public void when4ThenReturnIV() {
        assertRoman("IV", 4);
    }

    @Test
    public void when8ThenReturnVIII() {
        assertRoman("VIII", 8);
    }

    @Test
    public void when9ThenReturnIX() {
        assertRoman("IX", 9);
    }

    @Test
    public void when13ThenReturnXIII() {
        assertRoman("XIII", 13);
    }

    @Test
    public void when890ThenReturnDCCCXC(){
        assertRoman("DCCCXC", 890);
    }

    @Test
    public void when2013ThenReturnMMXI() {
        assertRoman("MMXIII", 2013);
    }

    private void assertRoman(String roman, int arabic){
        Assert.assertEquals(roman, new RomanNumeralConversion(arabic).convert());
    }
}
