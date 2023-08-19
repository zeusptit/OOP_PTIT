import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(), sex = sc.nextLine(), dob = sc.nextLine(), adress = sc.nextLine(), code = sc.nextLine(), day = sc.nextLine();
        Employee employee = new Employee(name, sex, dob, adress, code, day);
        System.out.println(employee);
    }
}