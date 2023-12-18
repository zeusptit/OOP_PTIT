import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test -- != 0){
            String s = sc.next();
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(stack.size() < 2) stack.push(i);
                else{
                    if(s.charAt(i) == '0' && s.charAt(stack.lastElement()) == '0' && s.charAt(stack.elementAt(stack.size() - 2)) == '1'){
                        stack.pop();
                        stack.pop();
                    }else 
                        stack.push(i);
                }
            }
            int ans = 0;
            for(int i = 1; i < stack.size(); i++){
                ans = Math.max(ans, stack.elementAt(i) - stack.elementAt(i - 1) - 1);
            }
            if(stack.empty()) ans = s.length();
            else{
                ans = Math.max(ans, stack.elementAt(0));
                ans = Math.max(ans, s.length() - stack.lastElement() - 1);
            }
            System.out.println(ans);
        }
    }
}