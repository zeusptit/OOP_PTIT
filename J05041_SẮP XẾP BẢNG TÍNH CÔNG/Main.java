import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Employee(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(list);
        for(Employee x : list){
            System.out.println(x);
        }
    }
}
/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
 */