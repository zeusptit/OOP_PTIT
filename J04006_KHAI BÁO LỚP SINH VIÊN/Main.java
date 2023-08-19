import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(sc.nextLine(), sc.next(), sc.next(), sc.nextDouble());
        System.out.println(student);
    }
}