public class Fizzbuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";

    public static Object fizzbuzz(int i) {
        if (i % 15 == 0)
            return FIZZBUZZ;
        else if (i % 3 == 0)
            return FIZZ;
        else if (i % 5 == 0)
            return BUZZ;
        else
            return i;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 50; i++)
            System.out.println(fizzbuzz(i));
    }
}
