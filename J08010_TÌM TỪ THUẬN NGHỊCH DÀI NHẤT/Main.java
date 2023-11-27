import java.util.*;

public class Main {
    public static boolean isPalinedrome(String s){
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int max_length = 0;
        while(sc.hasNextLine()){
            String[] words = sc.nextLine().trim().split("\\s+");
            for(String x : words){
                if(isPalinedrome(x)){
                    list.add(x);
                    max_length = Math.max(max_length, x.length());
                }
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(String x : list){
            if(map.get(x) == null && x.length() == max_length){
                System.out.println(x + " " + Collections.frequency(list, x));
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
    }
}
/*

 */