import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Product> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(Product x : list){
            System.out.println(x);
        }
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
 */