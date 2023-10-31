import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Company> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            list.add(new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            int start = sc.nextInt(), end = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + start + " DEN " + end + " SINH VIEN:");
            for(Company x : list){
                if(start <= x.getInternNumber() && x.getInternNumber() <= end){
                    System.out.println(x);
                }
            }
        }
    }
}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
1
30 50
 */
