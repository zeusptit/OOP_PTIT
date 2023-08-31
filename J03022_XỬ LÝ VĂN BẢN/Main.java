import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String temp = "";
        while(sc.hasNext()){
            String s = sc.next();
            if(s.isEmpty())break;
            if(s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '?' || s.charAt(s.length() - 1) == '!'){
                temp += s.substring(0, s.length() - 1);
                list.add(temp.trim());
                temp = "";
            }else{
                temp += s + " ";
            }
        }
        for(String x : list){
            x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
            System.out.println(x);
        }
    }
}
/*
ky thi LAP TRINH ICPC PTIT  bat dau to chuc     tu     nam 2010.
nhu vay, nam nay la          tron 10 nam!
    vay CO PHAI NAM NAY LA KY THI LAN THU 10?        khong phai! nam nay
la KY THI LAN THU 11.
 */