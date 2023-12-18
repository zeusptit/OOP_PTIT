
import java.util.*;

public class Main{

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Test> tests = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            tests.add(new Test(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(tests);
        for(Test x : tests){
            System.out.println(x);
        }
    }
}

/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
 */