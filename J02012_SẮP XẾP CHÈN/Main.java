import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            int k = arr[i], j = i - 1;
            while(j >= 0 && arr[j] > k){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
            System.out.print("Buoc " + i + ": ");
            for(int t = 0; t < i + 1; t++) System.out.print(arr[t] + " ");
            System.out.println();
        }
    }
}