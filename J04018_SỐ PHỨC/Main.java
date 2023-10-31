import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            Complex a = new Complex(sc.nextInt(), sc.nextInt());
            Complex b = new Complex(sc.nextInt(), sc.nextInt());
            Complex c = a.plus(b);
            System.out.print(c.mul(a) + ", ");
            System.out.println(c.mul(c));
        }
    }
}
/*
3
1 2 3 4
2 3 4 5
1 -2 5 -6
 */
