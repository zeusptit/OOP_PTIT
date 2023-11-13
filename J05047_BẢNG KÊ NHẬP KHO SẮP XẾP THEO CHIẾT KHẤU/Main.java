import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Product> list = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        while(test-- != 0){
            Product temp = new Product(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            StringBuilder sb = new StringBuilder();
            String[] words = temp.getProductName().split("\\s+");
            for(String x : words){
                sb.append(Character.toUpperCase(x.charAt(0)));
            }
            sb.delete(2, sb.length());
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
            temp.setProductID(sb.append(String.format("%02d", map.get(sb.toString()))).toString());
            list.add(temp);
        }
        Collections.sort(list);
        for(Product x : list){
            System.out.println(x);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
 */