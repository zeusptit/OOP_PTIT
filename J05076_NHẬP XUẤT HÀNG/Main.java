
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        while(n-- != 0){
            products.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        ArrayList<Trade> trades = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        while(m-- != 0){
            String temp = sc.next();
            for(Product x : products){
                if(x.getProductID().equals(temp)){
                    trades.add(new Trade(x.getProductID(), x.getProductName(), x.getProductRole(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
                }
            }
        }
        for(Trade x : trades){
            System.out.println(x);
        }
    }
}
/*
2
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
 */