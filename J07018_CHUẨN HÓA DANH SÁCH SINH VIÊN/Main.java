
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        for(Student x : list){
            System.out.println(x);
        }
    }
}
/*
2
nGuyEn  vaN    biNH
D20CQCN01-B
02/2/2002
3.1
   tRan    pHU      Cuong
D20CQCN02-B
12/2/2003
2.9
 */