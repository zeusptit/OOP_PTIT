import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while(n-- != 0){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("DN.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Company> companies = new ArrayList<>();
        while(m-- != 0){
            Company company = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            companies.add(company);
        }
        sc = new Scanner(new File("THUCTAP.in"));
        int p = Integer.parseInt(sc.nextLine());
        ArrayList<Internship> internships = new ArrayList<>();
        while(p-- != 0){
            String id = sc.next(), name = sc.next();
            for(Student x : students){
                if(x.getStudentID().equals(id)){
                    for(Company y : companies){
                        if(y.getCompanyID().equals(name)){
                            internships.add(new Internship(x.getStudentID(), x.getStudentName(), x.getStudentClass(), x.getStudentEmail(), y.getCompanyID(), y.getCompanyName(), y.getAvNumber()));
                        }
                    }
                }
            }
        }
        Collections.sort(internships);
        int q = Integer.parseInt(sc.next());
        while(q-- != 0){
            String temp = sc.next(), name = "";
            int num = 0, count = 0;
            for(Company x : companies){
                if(x.getCompanyID().equals(temp)){
                    name = x.getCompanyName();
                    num = x.getAvNumber();
                }
            }
            System.out.println("DANH SACH THUC TAP TAI " + name + ":");
            for(int idx = 0; idx < internships.size(); idx++){
                if(internships.get(idx).getCompanyID().equals(temp) && count < num){
                    System.out.println(internships.get(idx));
                    count++;
                }
            }
        }
    }
}