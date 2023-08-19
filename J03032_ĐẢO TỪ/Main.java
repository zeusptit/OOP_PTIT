import java.math.BigInteger;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            sc.nextLine();
            while(test-- != 0){
                String s = sc.nextLine();
                Stack<Character> stack = new Stack<>();
                s += " ";
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) != ' ')stack.push(s.charAt(i));
                    else{
                        while(!stack.isEmpty()){
                            System.out.print(stack.peek());
                            stack.pop();
                        }
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
}
/*
2
ABC DEF
123 456
 */