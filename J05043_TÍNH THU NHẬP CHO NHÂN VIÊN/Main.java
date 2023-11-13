import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Employee(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        for(Employee x : list){
            System.out.println(x);
        }
    }
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
 */