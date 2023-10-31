import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Candidate> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            list.add(new Candidate(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        double max_totalScore = list.get(list.size() - 1).totalScore();
        for(Candidate x : list){
            if(x.totalScore() == max_totalScore){
                System.out.println(x);
            }
        }
    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
 */
