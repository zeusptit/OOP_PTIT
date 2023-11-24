import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>(), temp = new ArrayList<>();
        while(test-- != 0){
            Student x = new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()));
            list.add(x);
            temp.add(x);
        }
        Collections.sort(temp);
        double curGpa = temp.get(0).getStudentGpa();
        int tempRank = 1, dis = 0;
        for(Student x : temp){
            if(x.getStudentGpa() != curGpa){
                curGpa = Math.min(curGpa, x.getStudentGpa());
                tempRank += dis;
                dis = 1;
            }else{
                dis++;
            }
            x.setStudentRank(tempRank);
        }
        for(Student x : list){
            System.out.println(x);
        }
    }
}

/*
3
Tran Minh Hieu
5.9
Nguyen Bao Trung
8.6
Le Hong Ha
9.2
 */
