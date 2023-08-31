import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static int lowerBound(ArrayList<Integer> list, int n, int x){
        int l = -1, r = n;
        while(l + 1 < r){
            int m = (l + r) / 2;
            if(list.get(m) >= x){
                r = m;
            }else{
                l = m;
            }
        }
        return r;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt(), k = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            long ans = 0;
            for(int i = 0; i < n; i++){
                int temp = lowerBound(list, n,k + list.get(i));
                if(temp - i - 1 > 0){
                    ans += temp - i - 1;
                }
            }
            System.out.println(ans);
        }
    }
}