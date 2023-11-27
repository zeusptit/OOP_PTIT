import java.util.ArrayList;

public class Customer implements Comparable<Customer>{
    public static int count = 1;
    private String customerID;
    private String customerName;
    private String customerSex;
    private String customerDob;
    private String custormerAddress;

    public Customer(String customerName, String customerSex, String customerDob, String custormerAddress) {
        this.customerID = "KH" + String.format("%03d", count++);
        this.customerName = normalizeName(customerName);
        this.customerSex = customerSex;
        this.customerDob = normalizeDob(customerDob);
        this.custormerAddress = custormerAddress;
    }
    public String normalizeName(String name){
        StringBuilder sb = new StringBuilder();
        String[] words = name.trim().split("\\s+");
        for(String x : words){
            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public String normalizeDob(String dob){
        StringBuilder sb = new StringBuilder(dob);
        if(sb.charAt(1) == '/')sb.insert(0, "0");
        if(sb.charAt(4) == '/')sb.insert(3, "0");
        return sb.toString();
    }
    public String getDOB(){
        return customerDob;
    }
    public String getDob(String dob){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        String[] temp = dob.split("/");
        for(String x : temp){
            if(!x.isEmpty()){
                list.add(x);
            }
        }
        for(int i = list.size() - 1; i >= 0; i--){
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Customer o) {
        return getDob(customerDob).compareTo(getDob(o.customerDob));
    }

    @Override
    public String toString() {
        return customerID + " " + customerName + " " + customerSex + " " + custormerAddress + " " + customerDob;
    }
}
