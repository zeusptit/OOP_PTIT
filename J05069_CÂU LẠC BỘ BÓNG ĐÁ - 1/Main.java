import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Club> clubList = new ArrayList<>();
        for(int i = 1; i <= test; i++){
            clubList.add(new Club(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        int num = Integer.parseInt(sc.nextLine());
        ArrayList<Match> matchList = new ArrayList<>();
        while(test-- != 0){
            String id = sc.next();
            int fanNum = sc.nextInt();
            for(Club x : clubList){
                if(x.getClubID().equals(id.substring(1, 3))){
                    matchList.add(new Match(x.getClubID(), x.getClubName(), x.getPrice(), id, fanNum * x.getPrice()));
                }
            }
        }
        for(Match x : matchList){
            System.out.println(x);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
 */