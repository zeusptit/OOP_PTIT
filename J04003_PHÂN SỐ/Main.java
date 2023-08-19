import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction fraction = new Fraction(sc.nextLong(), sc.nextLong());
        System.out.println(fraction.compact(fraction));
    }
}