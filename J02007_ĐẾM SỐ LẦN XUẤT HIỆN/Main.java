import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t <= test; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(map.containsKey(arr[i])){
                    int freq = map.get(arr[i]);
                    map.put(arr[i], freq + 1);
                }else{
                    map.put(arr[i], 1);
                }
            }
            System.out.println("Test " + t + ":");
            for(int i = 0; i < n; i++){
                if(map.containsKey(arr[i])){
                    System.out.println(arr[i] + " xuat hien " + map.get(arr[i]) + " lan");
                    map.remove(arr[i]);
                }
            }
        }
    }
}