import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if(a == 0){
            if(b != 0)
                System.out.println("VN");
            else
                System.out.println("VSN");
        }else {
            if(b == 0){
                System.out.println(0);
            }else{
                System.out.printf("%.2f", (-1) * b / a);
            }
        }
    }
}