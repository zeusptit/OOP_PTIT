import java.math.BigInteger;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            stack.push(s.charAt(0));
            for(int i = 1; i < s.length(); i++){
                if(!stack.isEmpty() && s.charAt(i) == stack.peek()){
                    stack.pop();
                }else
                    stack.push(s.charAt(i));
            }
            if(stack.isEmpty())
                System.out.println("Empty String");
            else{
                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty()){
                    sb.insert(0, stack.peek());
                    stack.pop();
                }
                System.out.println(sb.toString());
            }
        }
}
/*

 */