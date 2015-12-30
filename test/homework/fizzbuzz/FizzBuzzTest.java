package homework.fizzbuzz;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by taro on 10/6/15.
 */
public class FizzBuzzTest extends TestCase {

//***Note: if Test class extends TestCase, muststart method name with "test" word
//***Note: if Test class not extends TestCase, must use @Test over method name

    private FizzBuzz fb;

    @Before
    public void setUp() {
        fb = new FizzBuzz();
    }

    public void test_get1_return1() {

        String result = fb.get(1);
        Assert.assertEquals("1", result);
    }

    public void test_get2_return2() {//if have no @Test must start method name with "test" word

        String result = fb.get(2);
        Assert.assertEquals("2", result);
    }

    public void test_get3_return3() {

        String result = fb.get(3);
        Assert.assertEquals("Fizz", result);
    }

    public void test_get5_returnBuzz() {

        String result = fb.get(5);
        Assert.assertEquals("Buzz", result);
    }

    public void test_get6_returnFizz(){
        String result = fb.get(6);
        Assert.assertEquals("Fizz",result);
    }

    public void test_get10_returnFizz(){
        String result = fb.get(10);
        Assert.assertEquals("Buzz",result);
    }

    public void test_get15_returnFizzBuzz(){
        String result = fb.get(15);
        Assert.assertEquals("FizzBuzz",result);
    }
}
