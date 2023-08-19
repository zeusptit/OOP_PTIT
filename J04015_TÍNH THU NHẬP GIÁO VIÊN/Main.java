import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Income income = new Income(sc.nextLine(), sc.nextLine(), sc.nextInt());
        sc.nextLine();
        System.out.println(income);
    }
}