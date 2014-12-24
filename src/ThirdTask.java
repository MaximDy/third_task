import java.math.BigInteger;

public class ThirdTask {

    //Found up here http://stackoverflow.com/questions/5317732/when-calculating-the-factorial-of-100-100-with-java-using-integers-i-get-0
    //that factorial(100) cannot be stored even in 64bits, so i had to use BigDecimal to count it
    public static void main(String[] args){
        BigInteger factorial = BigInteger.ONE;
        long numberOfDigits =0;

        for (int i=1; i<=100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        while (factorial.compareTo(BigInteger.ZERO) > 0) {
            numberOfDigits += factorial.mod(BigInteger.TEN).longValue();
            factorial = factorial.divide(BigInteger.TEN);
        }

        System.out.println(numberOfDigits);
    }
}
