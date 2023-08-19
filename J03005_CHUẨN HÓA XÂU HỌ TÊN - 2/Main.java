import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- != 0){
            String s = sc.nextLine();
            String[] words = s.split(" ");
            ArrayList<String> arrayList = new ArrayList<>();
            for(String temp : words){
                if (!temp.isEmpty()) {
                    temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
                    arrayList.add(temp);
                }
            }
            String temp = null;
            if(!arrayList.isEmpty()) {
                temp = arrayList.get(0).toUpperCase();
            }
            for(int i = 1; i < arrayList.size(); i++){
                if(i != arrayList.size() - 1)
                    System.out.print(arrayList.get(i) + " ");
                else
                    System.out.print(arrayList.get(i) + ", ");
            }
            System.out.println(temp);
        }
    }
}
/*
4
    nGUYEn    quaNG   vInH
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
 */