import java.util.Scanner;

public class Main {
    public static String solve(String s){
        int count_4 = 0, count_7 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4')count_4++;
            else if(s.charAt(i) == '7')count_7++;
        }
        if(count_7 + count_4 == 4 || count_7 + count_4 == 7)return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = 1;
        while(test-- != 0){
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}