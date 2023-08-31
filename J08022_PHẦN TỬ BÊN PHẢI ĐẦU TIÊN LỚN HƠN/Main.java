import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n], b = new int[n];
            for(int i = 0; i < n; i++)a[i] = scanner.nextInt();
            Stack<Integer> stack = new Stack<>();
            stack.push(a[n - 1]);
            b[n - 1] = -1;
            for(int i = n - 2; i >= 0; i--){
                if(!stack.isEmpty() && stack.peek() > a[i]){
                    b[i] = stack.peek();
                    stack.push(a[i]);
                }else{
                    while(!stack.isEmpty() && stack.peek() <= a[i])stack.pop();
                    if(!stack.isEmpty())b[i] = stack.peek();
                    else b[i] = -1;
                    stack.push(a[i]);
                }
            }
            for(int x : b) System.out.print(x + " ");
            System.out.println();
        }
    }
}
