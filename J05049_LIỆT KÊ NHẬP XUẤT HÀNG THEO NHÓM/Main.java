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
            list.add(new Product(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(list);
        String queryGroup = sc.nextLine();
        for(Product x : list){
            if(x.getProductID().substring(0, 1).equals(queryGroup)){
                System.out.println(x);
            }
        }
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
 */