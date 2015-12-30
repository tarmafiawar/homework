package homework.romanNumeral;

/**
 * Created by thatchai on 11/24/15.
 */
public class RomanNum {
    private String symbol;
    private int value;

    RomanNum(String symbol, int value){
        this.symbol = symbol;
        this.value = value;
    }

    public String getSymbol(){
        return symbol;
    }

    public int getValue(){
        return value;
    }
}
