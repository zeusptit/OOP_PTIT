import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Name> list = new ArrayList<>();
        while(n-- != 0){
            list.add(new Name(sc.nextLine()));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String s = sc.nextLine();
            for(Name x : list){
                if(x.compare(s)){
                    System.out.println(x);
                }
            }
        }
    }
}