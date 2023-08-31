import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Contest> list = new ArrayList<>();
        while(n-- != 0){
            list.add(new Contest(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Contest x : list){
            System.out.println(x);
        }
    }
}