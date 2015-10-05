import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {

    @Test
    public void should_return_1_when_1() {
        Assert.assertEquals(1, Fizzbuzz.fizzbuzz(1));
    }

    @Test
    public void should_return_2_when_2() {
        Assert.assertEquals(2, Fizzbuzz.fizzbuzz(2));
    }

    @Test
    public void should_return_fizz_when_3() {
        Assert.assertEquals(Fizzbuzz.FIZZ, Fizzbuzz.fizzbuzz(3));
    }

    @Test
    public void should_return_fizz_when_6() {
        Assert.assertEquals(Fizzbuzz.FIZZ, Fizzbuzz.fizzbuzz(6));
    }

    @Test
    public void should_return_buzz_when_5() {
        Assert.assertEquals(Fizzbuzz.BUZZ, Fizzbuzz.fizzbuzz(5));
    }

    @Test
    public void should_return_buzz_when_10() {
        Assert.assertEquals(Fizzbuzz.BUZZ, Fizzbuzz.fizzbuzz(10));
    }

    @Test
    public void should_return_fizzbuzz_when_15() {
        Assert.assertEquals(Fizzbuzz.FIZZBUZZ, Fizzbuzz.fizzbuzz(15));
    }
}


