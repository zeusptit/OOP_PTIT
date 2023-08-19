import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
        for(int i = 0; i < n - 1; i++){
            int idx = i;
            for(int j = i + 1; j < n; j++)if(arr[idx] > arr[j])idx = j;
            if(idx != i){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int k = 0; k < n; k++) System.out.print(arr[k] + " ");
            System.out.println();
        }
    }
}