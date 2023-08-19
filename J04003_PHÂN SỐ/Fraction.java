import java.math.BigInteger;

public class Fraction {
    long numerator, denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction compact(Fraction f){
        BigInteger temp = BigInteger.valueOf(f.numerator).gcd( BigInteger.valueOf(f.denominator));
        Fraction fraction = new Fraction();
        fraction.numerator = f.numerator / temp.longValue();
        fraction.denominator = f.denominator / temp.longValue();
        return fraction;
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}