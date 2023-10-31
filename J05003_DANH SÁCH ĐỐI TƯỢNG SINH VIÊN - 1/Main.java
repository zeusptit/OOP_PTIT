
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
Nguyen Van An
D20CQCN01-B
02/2/2002
3.19
Nguyen Van B
D20CQCN02-B
12/2/2003
2.9
 */