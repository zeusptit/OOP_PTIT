import java.util.*;

public class Main {
    static class Pair <F, S>{
        private F first;
        private S second;
        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }
        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair<Integer, Integer>> pairList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            pairList.add(new Pair<>(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(pairList, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.first - o2.first;
            }
        });
        long ans = pairList.get(0).first + pairList.get(0).second;
        for(int i = 1; i < n; i++){
            if(ans < pairList.get(i).first)
                ans = pairList.get(i).first + pairList.get(i).second;
            else
                ans += pairList.get(i).second;
        }
        System.out.println(ans);
    }
}
