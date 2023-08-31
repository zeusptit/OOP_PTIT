import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int solve(String s){
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(-1);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                stack.push(i);
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    ans = Math.max(ans, i - stack.peek());
                }
                if(stack.isEmpty())stack.push(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            String s = scanner.next();
            System.out.println(solve(s));
        }
    }
}
