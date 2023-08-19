import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String temp = sc.nextLine();
            if(temp.equals("END"))break;
            String[] words = temp.split(" ");
            for(String x : words){
                if(!x.isEmpty()){
                    x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
/*

 */
