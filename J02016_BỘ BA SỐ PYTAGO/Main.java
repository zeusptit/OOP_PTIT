import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            ArrayList<Long> list = new ArrayList<>();
            for(int i = 0; i < n; i++)a[i] = sc.nextInt();
            Arrays.sort(a);
            int flag = 0;
            for(int i = 0; i < n; i++)list.add((Long) 1L * a[i] * a[i]);
            for(int i = 0; i < n - 1; i++){
                int kt = 0;
                for(int j = i + 1; j < n; j++){
                    Long temp = (Long)1L * a[i] * a[i] + (Long)1L * a[j] * a[j];
                    if(Collections.binarySearch(list, temp) >= 0){
                        System.out.println("YES");
                        flag = 1;
                        kt = 1;
                        break;
                    }
                }
                if(kt != 0) break;
            }
            if(flag == 0)
                System.out.println("NO");
        }
    }
}