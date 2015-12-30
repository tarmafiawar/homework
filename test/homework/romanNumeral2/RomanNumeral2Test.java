package homework.romanNumeral2;

import homework.romanNumeral2.RomanConversion;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by taro on 11/24/15.
 */
public class RomanNumeral2Test {

    private RomanConversion rn;

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
    public void when2013ThenReturnMMXIII() {
        assertRoman("MMXIII", 2013);
    }

    private void assertRoman(String roman, int arabic){
        rn = new RomanConversion();
        Assert.assertEquals(roman, rn.convert(arabic));
    }
}
