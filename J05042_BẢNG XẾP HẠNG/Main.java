import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();
        while(test-- != 0){
            sc.nextLine();
            list.add(new Student(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        for(Student x : list){
            System.out.println(x);
        }
    }
}
/*
2
Nguyen Van Nam
168 599
Tran Thi Ngoc
168 600
 */