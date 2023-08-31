import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(sc.hasNextLine()){
            list.add(new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Subject x : list){
            if(x.filter(x.getPracticeType())){
                System.out.println(x);
            }
        }
    }
}