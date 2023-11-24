public class Club {
    private String clubID;
    private String clubName;
    private int price;

    public String getClubID() {
        return clubID;
    }

    public String getClubName() {
        return clubName;
    }

    public int getPrice() {
        return price;
    }

    public Club(String clubID, String clubName, int price) {
        this.clubID = clubID;
        this.clubName = clubName;
        this.price = price;
    }
}