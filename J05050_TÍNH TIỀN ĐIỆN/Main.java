import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Customer(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(Customer x : list){
            System.out.println(x);
        }
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
 */