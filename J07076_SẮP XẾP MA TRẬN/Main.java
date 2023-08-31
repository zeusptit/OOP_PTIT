import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            int n = sc.nextInt(), m = sc.nextInt(), col = sc.nextInt();
            int[][] matrix = new int[105][105];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            for(int j = 0; j < m; j++){
                if(j == col - 1){
                    for(int i = 0; i < n - 1; i++){
                        int min_val = i;
                        for(int k = i + 1; k < n; k++)if(matrix[min_val][j] > matrix[k][j])min_val = k;
                        if(min_val != i){
                            int temp = matrix[min_val][j];
                            matrix[min_val][j] = matrix[i][j];
                            matrix[i][j] = temp;
                        }
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
/*

 */
