import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(Student x : list){
            System.out.println(x);
        }
    }
}
/*
2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
 */
