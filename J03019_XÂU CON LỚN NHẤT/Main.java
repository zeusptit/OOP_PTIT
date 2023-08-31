import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int idx = 0;
        for(int i = 'z'; i >= 'a'; i--){
            for(int j = idx; j < s.length(); j++){
                if(s.charAt(j) == i){
                    System.out.print(s.charAt(j));
                    idx = j;
                }
            }
        }
    }
}
/*

 */