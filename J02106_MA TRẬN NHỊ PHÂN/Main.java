import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1)temp++;
            }
            if(temp > 1)
                count++;
        }
        System.out.println(count);
    }
}