public class Electronic implements Comparable<Electronic> {
    public static int count = 1;
    private String id;
    private String name;
    private String role;
    private int start, end;
    private int electronicNumber;
    private int inQuota, outQuota, vat, finalBill;

    public String stdName(String name){
        StringBuilder sb = new StringBuilder();
        String[] word = name.split(" ");
        for(String x : word){
            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public Electronic(String name, String role, int start, int end) {
        this. id = "KH" + String.format("%02d", count++);
        this.name = stdName(name);
        this.role = role;
        if(this.role.compareTo("A") == 0)this.electronicNumber = 100;
        else if(this.role.compareTo("B") == 0)this.electronicNumber = 500;
        else this.electronicNumber = 200;
        this.start = this.electronicNumber;
        this.end = end - start;
        this.inQuota = Math.min(this.end, this.start) * 450;
        this.outQuota = Math.max(0, this.end - this.start) * 1000;
        this.vat = this.outQuota / 20;
        this.finalBill = this.inQuota + this.outQuota + this.vat;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + inQuota + " " + outQuota + " " + vat + " " + finalBill;
    }

    @Override
    public int compareTo(Electronic o) {
        return o.finalBill - this.finalBill;
    }
}