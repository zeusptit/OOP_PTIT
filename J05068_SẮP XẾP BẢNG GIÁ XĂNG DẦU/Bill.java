public class Bill implements Comparable<Bill>{
    private String billID;
    private Long amount;
    private Long tax;
    private String manufacturer;
    private Long price, finalBill;

    public Bill(String billID, Long amount) {
        this.billID = billID;
        this.amount = amount;
        this.manufacturer = fixManufacturer(billID);
        if(billID.charAt(0) == 'X'){
            this.price = 128000L;
            this.tax = 30L;
        }else if(billID.charAt(0) == 'D'){
            this.price = 11200L;
            this.tax = 35L;
        }else{
            this.price = 9700L;
            this.tax = 20L;
        }
        if(!this.manufacturer.equals("Trong Nuoc")){
            this.finalBill = this.price * this.amount * (1000 + this.tax) / 1000;
        }else{
            this.finalBill = this.price * this.amount;
            this.tax = 0L;
        }
    }
    public String fixManufacturer(String s){
        String temp = s.substring(billID.length() - 2);
        if(temp.equals("BP"))return "British Petro";
        else if(temp.equals("ES"))return "Esso";
        else if(temp.equals("SH"))return "Shell";
        else if(temp.equals("CA"))return "Castrol";
        else if(temp.equals("MO"))return "Mobil";
        return "Trong Nuoc";
    }
    public Long getTaxBill(){
        return amount * price * tax / 1000;
    }

    @Override
    public String toString() {
        return billID + " " + manufacturer + " " + price + " " + getTaxBill() + " " + finalBill;
    }

    @Override
    public int compareTo(Bill o) {
        return o.finalBill.compareTo(finalBill);
    }
}
