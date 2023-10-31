import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectange = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(rectangle.getWidth() > 0 && rectangle.getHeight() > 0){
            StringBuilder sb = new StringBuilder(rectangle.getColor().toLowerCase());
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            System.out.println((int)rectangle.findPerimeter() + " " + (int)rectangle.findArea() + " " + sb.toString());
        }else
            System.out.println("INVALID");
    }
}