import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> list = new ArrayList<>();
        while(sc.hasNextLine()){
            list.add(new Name(sc.nextLine()));
        }
        Collections.sort(list);
        for(Name x : list){
            System.out.println(x);
        }
    }
}