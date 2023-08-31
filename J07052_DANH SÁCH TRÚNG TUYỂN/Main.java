import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> list = new ArrayList<>();
        while(n-- != 0){
            list.add(new Candidate(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        int target = Integer.parseInt(sc.nextLine());
        Collections.sort(list);
        if(target > list.size())target = list.size();
        double score = list.get(target - 1).getScore();
        System.out.printf("%.1f\n", score);
        for(Candidate x : list){
            if(x.getScore() >= score)
                x.setMod("TRUNG TUYEN");
            else
                x.setMod("TRUOT");
            System.out.println(x);
        }
    }
}