
import java.util.*;

public class Main{

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Test> tests = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            tests.add(new Test(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(tests);
        for(Test x : tests){
            System.out.println(x);
        }
    }
}

/*
3
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
 */