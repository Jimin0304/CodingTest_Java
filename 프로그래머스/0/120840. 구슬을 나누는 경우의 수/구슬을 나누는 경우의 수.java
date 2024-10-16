import java.math.BigInteger;

class Solution {
    public BigInteger factorial(int number) {
        BigInteger big_number = new BigInteger(Integer.toString(number));
        if (number <= 1)
            return new BigInteger("1");
        return big_number.multiply(factorial(big_number.subtract(new BigInteger("1")).intValue()));
    }
    
    public BigInteger solution(int balls, int share) {
        return (factorial(balls).divide((factorial(balls - share).multiply(factorial(share)))));
    }
}