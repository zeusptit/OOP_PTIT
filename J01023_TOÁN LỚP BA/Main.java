import java.util.Scanner;
import java.util.Vector;

public class Main {
    static int test, ok;

    static void Try(int i, Vector<Integer> select, int n, String s) {
        if (ok == 1) return;
        for (int j = 0; j < 10; j++) {
            select.add(j);
            if (i == n) {
                int x = 0;
                StringBuilder temp = new StringBuilder(s);
                for (int k = 0; k < s.length(); k++) {
                    if (k != 3 && temp.charAt(k) == '?')
                        temp.setCharAt(k, (char) (select.get(x++) + '0'));
                }
                if (temp.charAt(0) != '0' && temp.charAt(5) != '0' && temp.charAt(10) != '0') {
                    int a = Integer.parseInt(temp.substring(0, 2));
                    int b = Integer.parseInt(temp.substring(5, 7));
                    int c = Integer.parseInt(temp.substring(10, 12));
                    if (temp.charAt(3) == '+' && a + b == c) {
                        System.out.println(temp);
                        ok = 1;
                        return;
                    }
                    if (temp.charAt(3) == '-' && a - b == c) {
                        System.out.println(temp);
                        ok = 1;
                        return;
                    }
                    if (temp.charAt(3) == '?') {
                        if (a + b == c) {
                            temp.setCharAt(3, '+');
                            System.out.println(temp);
                            ok = 1;
                            return;
                        }
                        if (a - b == c) {
                            temp.setCharAt(3, '-');
                            System.out.println(temp);
                            ok = 1;
                            return;
                        }
                    }
                }
            }
            if (i < n) Try(i + 1, select, n, s);
            select.remove(select.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            String s = sc.nextLine();
            int n = 0;
            ok = 0;
            Vector<Integer> select = new Vector<>();
            for (int i = 0; i < s.length(); i++) {
                if (i != 3 && s.charAt(i) == '?')
                    n++;
            }
            Try(0, select, n, s);
            if (ok == 0)
                System.out.println("WRONG PROBLEM!");
        }
    }
}
