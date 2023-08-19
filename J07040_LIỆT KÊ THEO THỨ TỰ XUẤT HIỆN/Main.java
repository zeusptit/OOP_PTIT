
    import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list1 = (ArrayList<String>) sc.readObject();
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        ArrayList<String> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        for(String x : list1){
            set1.addAll(Arrays.asList(x.trim().toLowerCase().split("\\s+")));
        }
        while(scanner.hasNextLine()){
            String s = scanner.nextLine().trim().toLowerCase();
            list2.addAll(Arrays.asList(s.split("\\s+")));
        }
        for(String x : list2){
            if(!set2.contains(x) && set1.contains(x)){
                System.out.println(x);
                set2.add(x);
            }
        }
    }
}
/*

 */
