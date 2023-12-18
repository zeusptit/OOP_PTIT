import java.util.*;

public class Main {
    public static void min(long[] a, int[] b, int start, int end, int step, int root){
        Stack<Integer> stack = new Stack<>();
        for(int i = start; i != end; i += step){
            while(!stack.isEmpty() && a[stack.lastElement()] >= a[i]) stack.pop();
            if(stack.isEmpty()) b[i] = root;
            else b[i] = stack.lastElement();
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = 2;
        int m = sc.nextInt(), n = sc.nextInt();
        long[] arr = new long[n];
        long res = 0;
        for(int i = 0; i < n; i++) arr[i] = sc.nextLong();
        while(test -- != 0){
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                if(test == 1) a[i] = arr[i];
                else a[i] = m - arr[i];
            }
            int[] l = new int[n];
            int[] r = new int[n];
            min(a, l, 0, n, 1, -1);
            min(a, r, n - 1, -1, -1, n);
            long ans = 0;
            for(int i = 0; i < n; i++){
                ans = Math.max(ans, a[i] * (r[i] - l[i] - 1));
            }
            res = Math.max(res, ans);
        }
        System.out.println(res);
    }
}