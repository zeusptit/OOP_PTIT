import java.util.ArrayList;
import java.util.Scanner;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

public class PaymentController {
    private Invoice invoice;
    private Rule rule;
    private Student student;
    private Subject subject;
    public PaymentController() {
        Scanner sc = new Scanner(System.in);
        String idSV = sc.nextLine();
        String nameSV = sc.nextLine();
        int noSub = Integer.parseInt(sc.nextLine());
        String idSub;
        String nameSub;
        int noCd;
        student = new Student(idSV, nameSV);
        double sum = 0;
        ArrayList<Subject> arrayList = new ArrayList<>();
        while(noSub-- > 0){
            idSub = sc.nextLine();
            nameSub = sc.nextLine();
            noCd = Integer.parseInt(sc.nextLine());
            arrayList.add(new Subject(nameSub, idSub, noCd));
        }
        String noQD = sc.nextLine();
        String nameQD = sc.nextLine();
        double bill = Double.parseDouble(sc.nextLine());
        for (Subject i : arrayList){
            sum += bill * i.getCredit();
        }
        rule = new Rule(noQD, nameQD, sum);
        invoice = new Invoice(rule);
        invoice.setAlSubject(arrayList);
        invoice.setAmount(sum);
        invoice.setSt(student);
    }
    public Invoice getInvoice() {
        return invoice;
    }
}