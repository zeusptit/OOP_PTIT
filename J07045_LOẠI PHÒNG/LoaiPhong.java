import java.util.ArrayList;
import java.util.Arrays;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String icon;
    private String name;
    private String bill;
    private String fee;

    public LoaiPhong(String input) {
        String[] word = input.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(word));
        this.icon = list.get(0);
        this.name = list.get(1);
        this.bill = list.get(2);
        this.fee = list.get(3);
    }

    @Override
    public String toString() {
        return icon + " " + name + " " + bill + " " + fee;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}