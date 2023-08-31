import java.math.BigInteger;

public class Fraction {
    private long numerator, denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
    }

    public Fraction compact(Fraction f){
        BigInteger temp = BigInteger.valueOf(f.numerator).gcd( BigInteger.valueOf(f.denominator));
        Fraction fraction = new Fraction();
        fraction.numerator = f.numerator / temp.longValue();
        fraction.denominator = f.denominator / temp.longValue();
        return fraction;
    }
    public Fraction plus(Fraction x){
        Fraction ans = new Fraction();
        ans.numerator = numerator * x.denominator + x.numerator * denominator;
        ans.denominator = denominator * x.denominator;
        return compact(ans);
    }
    public Fraction mul(Fraction x){
        Fraction ans = new Fraction();
        ans.numerator = numerator * x.numerator;
        ans.denominator = denominator * x.denominator;
        return compact(ans);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}