import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t <= test; t++){
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] arr1 = new int[n][m], arr2 = new int[m][n], ans = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr1[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    arr2[i][j] = arr1[j][i];
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < m; k++){
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            System.out.println("Test " + t + ":");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}