import java.util.Scanner;

public class Main {
    public static String solve(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9')sb.append('0');
            else if(s.charAt(i) == '1') sb.append('1');
            else return "INVALID";
        }
        String ans = sb.toString();
        if(Long.parseLong(ans) == 0)
            return "INVALID";
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- != 0){
            String s = sc.nextLine();
            String ans = solve(s);
            if(ans == "INVALID")
                System.out.println(ans);
            else
                System.out.println(Long.parseLong(ans));
        }
    }
}