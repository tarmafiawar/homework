package homework.thaiNumeral;

import homework.thaiNumeral.ThaiNumConversion;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by thatchai on 12/8/15.
 */
public class ThaiNumeralTest{

        private ThaiNumConversion tnc;

        @Test
        public void when1ThenReturn1InThai(){
            assertThaiNum("หนึ่ง", 1);
        }

        @Test
        public void when3ThenReturn3InThai() {
            assertThaiNum("สาม", 3);
        }

        @Test
        public void when4ThenReturn4InThai() {
            assertThaiNum("สี่", 4);
        }

        @Test
        public void when8ThenReturn5InThai() {
            assertThaiNum("แปด", 8);
        }

        @Test
        public void when9ThenReturn6InThai() {
            assertThaiNum("เก้า", 9);
        }

        @Test
        public void when13ThenReturn11InThai() {
            assertThaiNum("สิบเอ็ด", 11);
        }

        @Test
        public void when13ThenReturn13InThai() {
            assertThaiNum("สิบสาม", 13);
        }

        @Test
        public void when19ThenReturn19InThai() {
            assertThaiNum("สิบเก้า", 19);
        }

        @Test
        public void when20ThenReturn20InThai() {
            assertThaiNum("ยี่สิบ", 20);
        }

        @Test
        public void when21ThenReturn21InThai() {
            assertThaiNum("ยี่สิบเอ็ด", 21);
        }

        @Test
        public void when22ThenReturn22InThai() {
            assertThaiNum("ยี่สิบสอง", 22);
        }

        @Test
        public void when32ThenReturn32InThai() {
            assertThaiNum("สามสิบสอง", 32);
        }

//        @Test
//        public void when890ThenReturn890InThai(){
//            assertThaiNum("แปดร้อยเก้าสิบ", 890);
//        }
//
//        @Test
//        public void when2013ThenReturn2013InThai() {
//            assertThaiNum("สองพันสิบสาม", 2013);
//        }

        private void assertThaiNum(String numInThai, int inputNum){
            tnc = new ThaiNumConversion();
            Assert.assertEquals(numInThai, tnc.convert(String.valueOf(inputNum)));
        }
}
