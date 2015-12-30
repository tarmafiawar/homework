package homework.fizzbuzz;

/**
 * Created by taro on 10/6/15.
 */
public class FizzBuzz {
    public String get(int input) {
        String result = "";

        /*
        if(input%3==0 && input%5==0)
            result = "FizzBuzz";
        else if(input%3==0)
            result = "Fizz";
        else if(input%5==0)
            result = "Buzz";
        else
            result = String.valueOf(input);
        */

        result += input%3 == 0 ? "Fizz" : "";
        result += input%5 == 0 ? "Buzz" : "";
        result = result.isEmpty() ? String.valueOf(input) : result;

        return result;
    }
}
