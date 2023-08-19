import java.util.*;

public class Main {
    static int[] X = new int[100], visited = new int[100];

    public static boolean check(int[] arr, int n) {
        for(int i = 2; i <= n; i++){
            if(Math.abs(arr[i] - arr[i - 1]) == 1)
                return false;
        }
        return true;
    }

    public static void Try(int n, int i){
        for(int j = 1; j <= n; j++){
            if(visited[j] == 0 ){
                X[i] = j;
                visited[j] = 1;
                if (i == n && check(X, n)) {
                    for (int k = 1; k <= n; k++) System.out.print(X[k]);
                    System.out.println();
                } else
                    Try(n, i + 1);
                visited[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            Try(n, 1);
            System.out.println();
        }
    }
}