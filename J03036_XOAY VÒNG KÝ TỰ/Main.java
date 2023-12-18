import java.util.Scanner;

public class Main {
    public static int roll(String x1, String x2) {
        String dest = x1;
        String src = x2;
        int len = src.length();
        char[] temp = new char[1];
        int i = 0;
        if (dest.equals(src)) {
            return i;
        }
        while (i < len) {
            temp[0] = src.charAt(0);
            src = src.substring(1) + new String(temp);
            i++;
            if (dest.equals(src)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s1 = new String[100];
        for (int i = 0; i < n; i++) {
            s1[i] = sc.next();
        }
        int i = 0;
        int min = 999999999;
        while (min != -1 && i < n) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                int temp = roll(s1[i], s1[j]);
                if (temp == -1) {
                    count = -1;
                    break;
                }
                count += temp;
            }
            if (min > count) {
                min = count;
            }
            i++;
        }
        System.out.println(min);
    }
}
