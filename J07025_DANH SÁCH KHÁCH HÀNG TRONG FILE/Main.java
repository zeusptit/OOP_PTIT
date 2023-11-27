import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Customer x : list){
            System.out.println(x);
        }
    }
}
/*
2
 nGuyen VAN     nAm
Nam
12/2/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
4/11/1995
Phung Khoang-Nam Tu Liem-Ha Noi
 */