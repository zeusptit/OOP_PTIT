import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- != 0){
            String s = sc.nextLine();
            TreeSet<String> set1 = new TreeSet<>(), set2 = new TreeSet<>();
            String[] words = s.split(" ");
            String t = sc.nextLine();
            String[] wordss = t.split(" ");
            for(String x : wordss){
                set2.add(x);
            }
            for(String x : words){
                if(!set2.contains(x)){
                    set1.add(x);
                }
            }
            for(String x : set1){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
/*
2
abc ab ab ab abcd
ab abc
aaa xyz ab zzz abc dd dd abc
xyz dd ttt sas cdc
 */