package homework.romanNumeral;

/**
 * Created by taro on 11/24/15.
 */
public class Main {
    public static void main(String args[]){
        //compile  : shift + cmd + fn + F9
        //run java -cp /Users/taro/homework/out/production/HomeWork/ homework.romanNumeral.Main 2014


//        System.out.println("Result : " +RomanNumerals.arabicToRoman(Integer.parseInt(args[0])));

        System.out.println("Result : " + new RomanNumeralConversion(Integer.parseInt(args[0])).convert());

    }
}
