import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            Queue<String> queue = new ArrayDeque<>();
            queue.add("9");
            while(true){
                String temp = queue.peek(); queue.remove();
                if(Integer.parseInt(temp) % n == 0){
                    System.out.println(temp);
                    break;
                }
                queue.add(temp + "0");
                queue.add(temp + "9");
            }
        }
    }
}
