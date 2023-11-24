public class Match extends Club implements Comparable<Match>{
    private String matchID;
    private int matchPrice;

    public Match(String clubID, String clubName, int price, String matchID, int matchPrice) {
        super(clubID, clubName, price);
        this.matchID = matchID;
        this.matchPrice = matchPrice;
    }

    @Override
    public String toString() {
        return matchID + " " + getClubName() + " " + matchPrice;
    }

    @Override
    public int compareTo(Match o) {
        if(matchPrice != o.matchPrice){
            return o.matchPrice - matchPrice;
        }
        return this.getClubName().compareTo(o.getClubName());
    }
}
