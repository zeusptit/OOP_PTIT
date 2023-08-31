import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList<Electronic> list = new ArrayList<>();
        while(n-- != 0){
            sc.nextLine();
            list.add(new Electronic(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        for(Electronic x : list){
            System.out.println(x);
        }
    }
}
