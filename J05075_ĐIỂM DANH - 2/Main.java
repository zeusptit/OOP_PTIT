
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i = 0; i < n; i++){
            String id = sc.next(), atdList = sc.next();
            int attGrade = 10;
            for(Student x : list){
                if(x.getStudentID().equals(id)){
                    for(char y : atdList.toCharArray()){
                        if(y == 'v')attGrade -= 2;
                        else if(y == 'm')attGrade -= 1;
                    }
                    x.setAttendanceGrade(attGrade);
                }
            }
        }
        String queryClass = sc.next();
        for(Student x : list){
            if(x.getStudentClass().equals(queryClass)){
                System.out.println(x);
            }
        }
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
D19CQAT02-B
 */