import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            Queue<String> queue = new ArrayDeque<>();
            queue.add("6"); queue.add("8");
            ArrayList<String> list = new ArrayList<>();
            while(true){
                String temp = queue.peek(); queue.remove();
                if(temp.length() > n){
                    break;
                }else{
                    list.add(temp);
                }
                queue.add(temp + "6");
                queue.add(temp + "8");
            }
            Collections.reverse(list);
            System.out.println(list.size());
            for(String x : list){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
