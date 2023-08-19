import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            int flag = 0;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    flag = 1;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag == 0)break;
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int t = 0; t < n; t++) System.out.print(arr[t] + " ");
            System.out.println();
        }
    }
}