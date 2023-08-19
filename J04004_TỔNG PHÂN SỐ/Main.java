import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextInt(), sc.nextInt()), b = new Fraction(sc.nextInt(), sc.nextInt());
        Fraction ans = a.plus(b);
        System.out.println(ans);
    }
}