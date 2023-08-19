import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- != 0){
            String s = sc.nextLine();
            String[] words = s.split(" ");
            for(String temp : words){
                if (!temp.isEmpty()) {
                    temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
                    System.out.print(temp + " ");
                }
            }
            System.out.println();
        }
    }
}