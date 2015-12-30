package homework.romanNumeral2;

/**
 * Created by thatchai on 11/29/15.
 */
public class RomanConversion {
    public static void main (String[] args) {
        System.out.println(new RomanConversion().convert(Integer.parseInt(args[0])));
    }

    public String convert(int num){
        StringBuilder sb = new StringBuilder();
        int times = 0;
        String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L","XC", "C", "CD", "D", "CM", "M" };
        int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,900, 1000 };
        for (int i = ints.length - 1; i >= 0; i--) {
            times =  num/ ints[i];
            num %= ints[i];
            while (times > 0) {
                sb.append(romans[i]);
                times--;
            }
        }
        return sb.toString();
    }

}
