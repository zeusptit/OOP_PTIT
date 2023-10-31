import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            list.add(new Product(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(Product x : list){
            System.out.println(x);
        }
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
 */