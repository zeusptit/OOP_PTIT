import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> list = new ArrayList<>();
        while(n-- != 0){
            list.add(new Candidate(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(Candidate x : list){
            System.out.println(x);
        }
    }
}