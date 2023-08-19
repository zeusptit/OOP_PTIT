import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new HashMap<>();
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- != 0) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            ArrayList<String> v = new ArrayList<>();

            for (String temp : words) {
                temp = temp.toLowerCase();
                v.add(temp);
            }
            String ans = null;
            if(v.size() != 0)
                ans = v.get(v.size() - 1);
            for (int i = 0; i < v.size() - 1; i++) {
                if (!v.get(i).isEmpty()) {
                    ans += v.get(i).charAt(0);
                }
            }

            mp.put(ans, mp.getOrDefault(ans, 0) + 1);

            if (mp.get(ans) == 1) {
                System.out.println(ans + "@ptit.edu.vn");
            } else {
                System.out.println(ans + mp.get(ans) + "@ptit.edu.vn");
            }
        }
    }
}
/*
4
    nGUYEn    quaNG   vInH
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aN
 */