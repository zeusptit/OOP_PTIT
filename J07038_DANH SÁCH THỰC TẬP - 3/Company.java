public class Company {
    private String companyID, companyName;
    private int avNumber;

    public Company(String companyID, String companyName, int avNumber) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.avNumber = avNumber;
    }

    public String getCompanyID() {
        return companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getAvNumber() {
        return avNumber;
    }
}
