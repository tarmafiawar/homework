package homework.romanNumeral;

/**
 * Created by taro on 11/24/15.
 */
public class RomanNumeralConversion {

    public static  final RomanNum[] romanNumeralArray = new RomanNum[] {
            //I, V, X, L, C, D, M
            new RomanNum("M", 1000),
            new RomanNum("CM", 900),
            new RomanNum("D", 500),
            new RomanNum("CD", 400),
            new RomanNum("C", 100),
            new RomanNum("XC", 90),
            new RomanNum("L", 50),
            new RomanNum("XL", 40),
            new RomanNum("X", 10),
            new RomanNum("IX", 9),
            new RomanNum("V", 5),
            new RomanNum("IV", 4),
            new RomanNum("I", 1),
    };

    public final StringBuilder processed = new StringBuilder();
    public int remainder;

    public RomanNumeralConversion(int remainder){
        this.remainder = remainder;
    }


    public String convert() {
        for(RomanNum romanNumeral : romanNumeralArray){
            process(romanNumeral);
        }
        return processed.toString();
    }

    private void process(RomanNum romanNumeral){
        while(remainder >= romanNumeral.getValue()){
            processed.append(romanNumeral.getSymbol());
            remainder -= romanNumeral.getValue();
        }
    }
}
