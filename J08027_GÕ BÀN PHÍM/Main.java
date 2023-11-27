import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Stack<Character> stack1 = new Stack<>(), stack2 = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '<'){
                if(!stack1.isEmpty()) {
                    stack2.push(stack1.peek());
                    stack1.pop();
                }
            }else if(x == '>'){
                if(!stack2.isEmpty()) {
                    stack1.push(stack2.peek());
                    stack2.pop();
                }
            }else if(x == '-') {
                if (!stack1.isEmpty())
                    stack1.pop();
            }else
                stack1.push(x);
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        while(!stack2.isEmpty()){
            System.out.print(stack2.peek());
            stack2.pop();
        }
    }
}