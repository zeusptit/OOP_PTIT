import java.util.Scanner;

public class Matrix {
    private int[][] matrix;
    public Matrix(int n, int m) {
        int[][] matrix = new int[n][m];
        this.matrix = matrix;
    }

    public void nextMatrix(Scanner sc) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b) {
        int n = this.matrix.length, m = b.matrix[0].length;
        Matrix ans = new Matrix(n, m);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans.matrix[i][j] = 0;
                for(int k = 0; k < b.matrix.length; k++){
                    ans.matrix[i][j] += this.matrix[i][k] * b.matrix[k][j];
                }
            }
        }
        return ans;
    }

    @Override
    public String toString() {
        String ans = new String();
        for(int i = 0; i < matrix.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < matrix[i].length; j++){
                sb.append(matrix[i][j]).append(" ");
            }
            ans += sb.toString().trim() + "\n";
        }
        return ans;
    }
}
