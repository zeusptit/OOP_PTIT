import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Hotel> ds = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
        while(n-- >0){
            ds.add(new Hotel(in.nextLine(), in.nextLine(), dateFormat.parse(in.nextLine()), dateFormat.parse(in.nextLine())));
        }
        Collections.sort(ds);
        for(Hotel tmp : ds){
            System.out.println(tmp);
        }
    }
}