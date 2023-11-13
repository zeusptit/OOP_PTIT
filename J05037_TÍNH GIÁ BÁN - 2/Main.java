import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Product> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt((sc.nextLine())), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(Product x : list){
            System.out.println(x);
        }
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
 */