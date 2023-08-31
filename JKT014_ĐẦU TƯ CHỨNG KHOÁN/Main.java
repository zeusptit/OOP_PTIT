import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n + 1], b = new int[n + 1];
            for(int i = 1; i <= n; i++)a[i] = scanner.nextInt();
            Stack<Integer> stack = new Stack<>();
            for(int i = 1; i <= n; i++){
                while(stack.size() != 0 && a[i] >= a[stack.peek()])stack.pop();
                if(stack.isEmpty())
                    b[i] = 0;
                else
                    b[i] = stack.peek();
                stack.push(i);
            }
            for(int i = 1; i <= n; i++){
                System.out.print((i - b[i]) + " ");
            }
            System.out.println();
        }
    }
}
