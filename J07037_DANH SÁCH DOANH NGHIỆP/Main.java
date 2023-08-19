import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<Company> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            list.add(new Company(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Company x : list){
            System.out.println(x);
        }
    }
}