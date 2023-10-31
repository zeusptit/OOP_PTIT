public class Company implements Comparable<Company>{
    private String companyId;
    private String companyName;
    private int internNumber;

    public Company(String companyId, String companyName, int internNumber) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.internNumber = internNumber;
    }

    @Override
    public String toString() {
        return companyId + " " + companyName + " " + internNumber;
    }


    @Override
    public int compareTo(Company o) {
        if(this.internNumber != o.internNumber)
            return o.internNumber - this.internNumber;
        return this.companyId.compareTo(o.companyId);
    }
}