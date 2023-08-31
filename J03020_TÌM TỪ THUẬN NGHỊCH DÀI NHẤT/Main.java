import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static class Pair <F, S>{
        private F first;
        private S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }
    }

    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l++) != s.charAt(r--))return false;
        }
        return true;
    }

    public static int find(ArrayList<Pair<String, Integer>> list, int n, String s){
        for(int i = 0; i < n; i++){
            if(s.equals(list.get(i).first)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair<String, Integer>> list = new ArrayList<>();
        int n = 0, max = -1;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.isEmpty())break;
            String[] word = s.split(" ");
            for(String x : word){
                if(check(x)) {
                    int index = find(list, n, x);
                    if (index == -1) {
                        list.add(new Pair<>(x, 1));
                        n++;
                    } else {
                        list.set(index, new Pair<>(x, list.get(index).second + 1));
                    }
                }
            }
        }
        for(Pair<String, Integer> x : list){
            if(x.first.length() > max){
                max = x.first.length();
            }
        }
        for(Pair<String, Integer> x : list){
            if(x.first.length() == max){
                System.out.println(x.first + " " + x.second);
            }
        }
    }
}