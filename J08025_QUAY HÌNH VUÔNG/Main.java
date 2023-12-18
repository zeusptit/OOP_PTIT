import java.util.*;

public class Main {
    public static int[] turn(int[] arr, int start){
        int[] a = new int[6];
        System.arraycopy(arr, 0, a, 0, 6);
        int x = a[start];
        a[start] = a[start + 3];
        a[start + 3] = a[start + 4];
        a[start + 4] = a[start + 1];
        a[start + 1] = x;
        return a;
    }

    public static boolean check(int[] a, int[] b){
        for(int i = 0; i < 6; i++) if(a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int s[] = new int[6];
            int t[] = new int[6];
            for(int i = 0; i < 6; i++) s[i] = sc.nextInt();
            for(int i = 0 ; i < 6; i++) t[i] = sc.nextInt();
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(s, 0));
            while(!q.isEmpty()){
                Pair u = q.poll();
                if(check(t, u.getA())){
                    System.out.println(u.getCnt());
                    break;
                }
                q.add(new Pair(turn(u.getA(), 0), u.getCnt() + 1));
                q.add(new Pair(turn(u.getA(), 1), u.getCnt() + 1));
            }
        }
    }
}