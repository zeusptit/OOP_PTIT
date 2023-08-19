import java.util.Scanner;

public class Main {
    public static String solve(String s){
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2)
                return "NO";
        }
        for(int i = 0; i < s.length(); i++)
            sum += s.charAt(i) - '0';
        if(sum % 10 != 0)return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- != 0){
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}