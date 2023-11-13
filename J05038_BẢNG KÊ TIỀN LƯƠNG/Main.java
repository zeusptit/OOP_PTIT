import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Employee(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt((sc.nextLine())), sc.nextLine()));
        }
        long totalWage = 0;
        for(Employee x : list){
            totalWage += x.getWage();
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: " + totalWage);
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
 */