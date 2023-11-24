import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Candidate(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(Candidate x : list){
            System.out.println(x);
        }
    }
}
/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
 */