import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String solve(String s){
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '(' || x == '{' || x == '[')
                stack.push(x);
            else{
                if(!stack.isEmpty()){
                    if(x == ')' && stack.peek() == '(' || x == '}' && stack.peek() == '{' || x == ']' && stack.peek() == '['){
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty())return "YES";
        return "NO";
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
