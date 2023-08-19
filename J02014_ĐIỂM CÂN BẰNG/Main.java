import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt(), sum = 0, prefixSum = 0, flag = 0;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            for(int i = 0; i < n; i++){
                if(prefixSum == sum - prefixSum - arr[i]){
                    System.out.println(i + 1);
                    flag = 1;
                    break;
                }
                prefixSum += arr[i];
            }
            if(flag == 0)
                System.out.println(-1);
        }
    }
}