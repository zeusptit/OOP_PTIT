

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[100005];
        for (int i = 1; i <= 100000; i++) {
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i <= n - 1; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        for(int i = 1; i <= n; i++){
            if(adj[i].size() == n - 1){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
/*

 */
