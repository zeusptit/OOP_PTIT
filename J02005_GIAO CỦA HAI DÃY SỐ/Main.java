import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>(), ansSet = new TreeSet<>();
        int[] a = new int[n], b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            if(set.contains(b[i]))
                ansSet.add(b[i]);
        }
        for(int x : ansSet){
            System.out.print(x + " ");
        }
    }
}