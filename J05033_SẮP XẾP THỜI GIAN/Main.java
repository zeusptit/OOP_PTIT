import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        while(n-- != 0){
            Time time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            times.add(time);
        }
        times.sort(new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                int time1 = o1.getTime();
                int time2 = o2.getTime();
                if (time1 < time2) {
                    return -1;
                } else if (time1 > time2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for(Time x : times){
            System.out.println(x);
        }
    }
}