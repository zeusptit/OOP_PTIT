import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Income> list = new ArrayList<>();
        int ht_num = 0, hp_num = 0;
        while(test-- != 0){
            Income income = new Income(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if(income.getPosition().equals("HT")){
                ht_num++;
                if(ht_num <= 1)list.add(income);
            }
            else if(income.getPosition().equals("HP")){
                hp_num++;
                if(hp_num <= 2)list.add(income);
            }else
                list.add(income);
        }
        for(Income x : list){
            System.out.println(x);
        }
    }
}

/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
 */