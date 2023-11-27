import java.util.*;

public class Main {
    public static boolean isNonDecreaseNumber(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) < s.charAt(i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] words = sc.nextLine().trim().split("\\s+");
            for(String x : words){
                if(isNonDecreaseNumber(x)){
                    list.add(x);
                }
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collections.frequency(list, o2) - Collections.frequency(list, o1);
            }
        });
        for(String x : list){
            if(map.get(x) == null){
                System.out.println(x + " " + Collections.frequency(list, x));
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
    }
}
/*

 */