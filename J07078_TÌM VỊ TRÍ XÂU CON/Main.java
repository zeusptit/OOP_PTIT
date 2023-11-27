import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            String s = sc.nextLine(), t = sc.nextLine();
            int temp = t.length();
            for(int i = 0; i <= s.length() - temp; i++){
                if(s.substring(i, i + temp).equals(t)){
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
/*
2
aaaaa
aa
abcde
bc
 */