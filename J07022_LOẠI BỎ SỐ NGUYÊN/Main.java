import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String temp = sc.next();
            try{
                Integer.parseInt(temp);
            }catch (Exception e){
                list.add(temp);
            }
        }
        Collections.sort(list);
        for(String x : list){
            System.out.print(x + " ");
        }
    }
}
/*

 */
