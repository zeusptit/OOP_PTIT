
import java.text.ParseException;
import java.util.*;

public class Main{

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Athlete> athletes = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            athletes.add(new Athlete(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(athletes);
        for(Athlete x : athletes){
            System.out.println(x);
        }
    }
}

/*
3
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
 */