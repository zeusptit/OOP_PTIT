

import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;


public class Main {
    public static int sum(String s){
        int sum = 0;
        for(char x : s.toCharArray()){
            if(x >= '0' && x <= '9')
                sum += x - '0';
        }
        return sum;
    }
    public static String solve(String s){
        StringBuilder sb = new StringBuilder(s);
        while(sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        ArrayList<String> ans = new ArrayList<>();
        for(String x : list){
            StringBuilder sb = new StringBuilder();
            for(char i : x.toCharArray()){
                if(i >= '0' && i <= '9')
                    sb.append(i);
            }
            if(!sb.toString().equals(""))ans.add(solve(sb.toString()));
        }
        for(String x : ans){
            System.out.println(x + " " + sum(x));
        }
    }
}
/*

 */
