import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max_value = 0, flag = 0;
        int[] arr = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
            max_value = Math.max(max_value, arr[i]);
        }
        for(int i = 1; i <= max_value; i++){
            if(!set.contains(i)){
                flag = 1;
                System.out.println(i);
            }
        }
        if(flag == 0)
            System.out.println("Excellent!");
    }
}