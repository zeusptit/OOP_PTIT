import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String solve(ArrayList<Integer> a){
        int n = 0, oddNum = 0, evenNum = 0;
        for(int x : a){
            n++;
            if(x % 2 == 0)evenNum++;
            else oddNum++;
        }
        if(n % 2 == 0 && evenNum > oddNum)return "YES";
        if(n % 2 != 0 && evenNum < oddNum)return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            ArrayList<Integer> list = new ArrayList<>();
            String s = sc.nextLine();
            String[] num = s.split(" ");
            for(String x : num){
                list.add(Integer.parseInt(x));
            }
            System.out.println(solve(list));
        }
    }
}
/*
2
11 22 33 44 55 66 77
23 34 45 56 67 78 89 90 121 131 141 151 161 171
 */