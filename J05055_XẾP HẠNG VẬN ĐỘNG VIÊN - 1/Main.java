import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Athlete> list = new ArrayList<>(), temp = new ArrayList<>();
        while(test-- != 0){
            Athlete x = new Athlete(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(x);
            temp.add(x);
        }
        Collections.sort(temp);
        long curTime = temp.get(0).getFinalTime();
        long tempRank = 1, dis = 0;
        for(Athlete x : temp){
            if(x.getFinalTime() != curTime){
                curTime = Math.max(curTime, x.getFinalTime());
                tempRank += dis;
                dis = 1;
            }else{
                dis++;
            }
            //System.out.println(x.getFinalTime() + " " + curTime);
            x.setRank(tempRank);
        }
        for(Athlete x : list){
            System.out.println(x);
        }
    }
}

/*
4
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
Nguyen Van Cuong
20/03/1990
07:00:00
07:10:01
 */

