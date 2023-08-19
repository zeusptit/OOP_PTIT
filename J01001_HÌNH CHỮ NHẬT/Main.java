import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a <= 0 || b <= 0){
            System.out.println(0);
        }else{
            System.out.println(a * 2 + b * 2 + " " + a * b);
        }
    }
}