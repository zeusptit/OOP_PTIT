import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        while(n-- != 0){
            list.add(new Student(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        int temp = 1;
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).getFinalScore() == list.get(i - 1).getFinalScore()){
                list.get(i).setRank(list.get(i - 1).getRank());
                temp++;
            }else{
                list.get(i).setRank(list.get(i - 1).getRank() + temp);
                temp = 1;
            }
        }
        for(Student x : list){
            System.out.println(x);
        }
    }
}
/*

 */
