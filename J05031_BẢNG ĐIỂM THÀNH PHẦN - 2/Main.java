import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println((i + 1) + " " + list.get(i));
        }
    }
}
/*
3
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0
 */