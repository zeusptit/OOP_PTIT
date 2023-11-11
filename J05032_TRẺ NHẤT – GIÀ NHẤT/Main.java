import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Person> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Person(sc.nextLine()));
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}

/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
 */