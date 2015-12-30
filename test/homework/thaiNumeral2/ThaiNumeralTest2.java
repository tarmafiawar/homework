package homework.thaiNumeral2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by thatchai on 12/8/15.
 */
public class ThaiNumeralTest2 {

        private ThaiNumConversion2 tnc;

        @Test
        public void when0ThenReturn0InThai() throws Exception {
            assertThaiNum("ศูนย์บาท", "0");
        }

        @Test
        public void when1ThenReturn1InThai() throws Exception {
            assertThaiNum("หนึ่งบาท", "1");
        }

        @Test
        public void when3ThenReturn3InThai() throws Exception {
            assertThaiNum("สามบาท", "3");
        }

        @Test
        public void when4ThenReturn4InThai() throws Exception {
            assertThaiNum("สี่บาท", "4");
        }

        @Test
        public void when8ThenReturn8InThai() throws Exception {
            assertThaiNum("แปดบาท", "8");
        }

        @Test
        public void when9ThenReturn9InThai() throws Exception {
            assertThaiNum("เก้าบาท", "9");
        }

        @Test
        public void when10ThenReturn10InThai() throws Exception {
            assertThaiNum("สิบบาท", "10");
        }

        @Test
        public void when11ThenReturn11InThai() throws Exception {
            assertThaiNum("สิบเอ็ดบาท", "11");
        }

        @Test
        public void when13ThenReturn13InThai() throws Exception {
            assertThaiNum("สิบสามบาท", "13");
        }

        @Test
        public void when19ThenReturn19InThai() throws Exception {
            assertThaiNum("สิบเก้าบาท", "19");
        }

        @Test
        public void when20ThenReturn20InThai() throws Exception {
            assertThaiNum("ยี่สิบบาท", "20");
        }

        @Test
        public void when21ThenReturn21InThai() throws Exception {
            assertThaiNum("ยี่สิบเอ็ดบาท", "21");
        }

        @Test
        public void when22ThenReturn22InThai() throws Exception {
            assertThaiNum("ยี่สิบสองบาท", "22");
        }
//
        @Test
        public void when32ThenReturn32InThai() throws Exception {
            assertThaiNum("สามสิบสองบาท", "32");
        }

        @Test
        public void when91ThenReturn91InThai() throws Exception {
            assertThaiNum("เก้าสิบเอ็ดบาท", "91");
        }

        @Test
        public void when890ThenReturn890InThai() throws Exception {
            assertThaiNum("แปดร้อยเก้าสิบบาท", "890");
        }

        @Test
        public void when2013ThenReturn2013InThai() throws Exception {
            assertThaiNum("สองพันสิบสามบาท", "2013");
        }

        @Test
        public void when2000013ThenReturn2000013InThai() throws Exception {
            assertThaiNum("สองล้านสิบสามบาท", "2000013");
        }

        @Test
        public void when1122211ThenReturn1122211InThai() throws Exception {
            assertThaiNum("หนึ่งล้านหนึ่งแสนสองหมื่นสองพันสองร้อยสิบเอ็ดบาท", "1122211");
        }

        @Test
        public void when11122211ThenReturn11122211InThai() throws Exception {
            assertThaiNum("สิบเอ็ดล้านหนึ่งแสนสองหมื่นสองพันสองร้อยสิบเอ็ดบาท", "11122211");
        }

        @Test
        public void when1111122211ThenReturn1111122211InThai() throws Exception {
            assertThaiNum("หนึ่งพันหนึ่งร้อยสิบเอ็ดล้านหนึ่งแสนสองหมื่นสองพันสองร้อยสิบเอ็ดบาท", "1111122211");
        }

        @Test
        public void when1131111111ThenReturn1131111111InThai() throws Exception {
            assertThaiNum("หนึ่งพันหนึ่งร้อยสามสิบเอ็ดล้านหนึ่งแสนหนึ่งหมื่นหนึ่งพันหนึ่งร้อยสิบเอ็ดบาท", "1131111111");//1,131,111,111
        }

        @Test
        public void when2147483647ThenReturn2147483647InThai() throws Exception {
            assertThaiNum("สองพันหนึ่งร้อยสี่สิบเจ็ดล้านสี่แสนแปดหมื่นสามพันหกร้อยสี่สิบเจ็ดบาท", "2147483647");//2,147,483,647 // MAX 1111111111111111111111111111111 bitCount=31
        }

//        @Test(expected = NumberFormatException.class)
//        public void when2147483648ThenReturn2147483648InThai() throws Exception {
//            assertThaiNum("สองพันหนึ่งร้อยสี่สิบเจ็ดล้านสี่แสนแปดหมื่นสามพันหกร้อยสี่สิบเจ็ดบาท", "2147483648");//2,147,483,648 // MAX+1
//        }

        @Test
        public void when_2ThenReturn_2InThai() throws Exception {
            assertThaiNum("ลบสองบาท", "-2");//2,147,483,647 // MAX 11111111111111111111111111111111 bitCount=32
        }

        @Test
        public void when_2147483641ThenReturn_2147483641InThai() throws Exception {
            assertThaiNum("ลบสองพันหนึ่งร้อยสี่สิบเจ็ดล้านสี่แสนแปดหมื่นสามพันหกร้อยสี่สิบเอ็ดบาท", "-2147483641" );//-2,147,483,641 // Min+7
        }

        @Test
        public void when_2147483648ThenReturn_2147483648InThai() throws Exception {
            assertThaiNum("ลบสองพันหนึ่งร้อยสี่สิบเจ็ดล้านสี่แสนแปดหมื่นสามพันหกร้อยสี่สิบแปดบาท", "-2147483648" );//-2,147,483,648 // Min
        }

//        @Test
//        public void when1point0_ThenReturn1point0_InThai() {
//            assertThaiNum("หนึ่งบาท", "1.0" );
//        }

        @Test
        public void when1point10_ThenReturn1point10_InThai() {
            assertThaiNum("หนึ่งบาทสิบสตางค์", "1.10" );
        }

        @Test
        public void when1point21_ThenReturn1point21_InThai() {
            assertThaiNum("หนึ่งบาทยี่สิบเอ็ดสตางค์", "1.21" );
        }

        @Test
        public void when_1point21_ThenReturn_1point21_InThai() {
            assertThaiNum("ลบหนึ่งบาทยี่สิบเอ็ดสตางค์", "-1.21" );
        }

//        @Test(expected = NumberFormatException.class)
//        public void when_1point221_ThenReturn_1point221_InThai() {
//            assertThaiNum("ลบหนึ่งบาทยี่สิบเอ็ด", "-1.331" );
//        }

//        @Test
//        public void when_space_ThenReturn_Exception() {
//            assertThaiNum("สองพันหนึ่งร้อยสี่สิบเจ็ดล้านสี่แสนแปดหมื่นสามพันหกร้อยสี่สิบเจ็ด", 2147483647);//2,147,483,647 // MAX
//        }

        private void assertThaiNum(String numInThai, String inputNumString) throws NumberFormatException {
            tnc = new ThaiNumConversion2();
            try {
//                Assert.assertEquals(numInThai, tnc.convert(String.valueOf(inputNum)));
                Assert.assertEquals(numInThai, tnc.convert(inputNumString));
            } catch (NumberFormatException e) {
                throw e;
            }
        }
}
