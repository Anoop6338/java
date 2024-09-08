package extras;

import java.math.BigInteger;

public class big_integer {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("123456789012345678901234567890");
        BigInteger b2 = new BigInteger("98765432109876543210");

        System.out.println(b1.add(b2));
        System.out.println();

        System.out.println(b1.multiply(b2));
        System.out.println();

        BigInteger b3 = BigInteger.ZERO;
        BigInteger b4 = BigInteger.ONE;
        BigInteger b5 = BigInteger.TWO;
        BigInteger b6 = BigInteger.TEN;

        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
    }
}
