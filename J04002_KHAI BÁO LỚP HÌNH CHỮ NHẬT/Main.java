import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange rectange = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(rectange.getWidth() > 0 && rectange.getHeight() > 0){
            StringBuilder sb = new StringBuilder(rectange.getColor().toLowerCase());
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            System.out.println((int)rectange.findPerimeter() + " " + (int)rectange.findArea() + " " + sb.toString());
        }else
            System.out.println("INVALID");
    }
}