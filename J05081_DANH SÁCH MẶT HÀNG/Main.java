import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- != 0){
            sc.nextLine();
            String name = sc.nextLine(), unit = sc.next();
            int buy = sc.nextInt(), sell = sc.nextInt();
            Product product = new Product(name, unit, buy, sell);
            products.add(product);
        }
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getProfit() != o2.getProfit()){
                    if(o1.getProfit() < o2.getProfit()){
                        return 1;
                    }else if(o1.getProfit() > o2.getProfit()) {
                        return -1;
                    }else return 0;
                }else{
                    return Integer.compare(
                            Integer.parseInt(o1.getId().substring(2)),
                            Integer.parseInt(o2.getId().substring(2))
                    );
                }
            }
        });
        for(Product x : products){
            System.out.println(x);
        }
    }
}