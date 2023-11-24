import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Bill(sc.next(), sc.nextLong()));
        }
        Collections.sort(list);
        for(Bill x : list){
            System.out.println(x);
        }
    }
}

/*
3
N89BP 4500
D00BP 3500
X92SH 2600
 */
