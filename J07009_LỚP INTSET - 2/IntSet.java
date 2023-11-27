import java.util.ArrayList;
import java.util.TreeSet;

public class IntSet {
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }
    public IntSet intersection(IntSet another){
        TreeSet<Integer> set_1 = new TreeSet<>(), set_2 = new TreeSet<>();
        for(int x : a)set_1.add(x);
        for(int x : another.a){
            if(set_1.contains(x)){
                set_2.add(x);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set_2);
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        IntSet res = new IntSet(ans);
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int x : a){
            sb.append(x).append(" ");
        }
        return sb.toString();
    }
}
