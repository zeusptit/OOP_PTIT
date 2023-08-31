import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        ArrayList<Time> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            list.add(new Time(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Time x : list){
            System.out.println(x);
        }
    }
}