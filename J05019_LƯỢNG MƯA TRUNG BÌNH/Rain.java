import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Rain implements Comparable<Rain>{
    private int count;
    private String stationID, stationLocation, startTime, endTime;
    private Double rainTime, rainRecord;

    public Rain(int count, String stationLocation, String startTime, String endTime, Double rainRecord) throws ParseException {
        this.stationID = "T" + String.format("%02d", count);
        this.stationLocation = stationLocation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.rainRecord = rainRecord;
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        this.rainTime = (double) ((format.parse(endTime).getTime() - format.parse(startTime).getTime()) / 1000 / 60);
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public void setRainTime(Double rainTime) {
        this.rainTime = rainTime;
    }

    public void setRainRecord(Double rainRecord) {
        this.rainRecord = rainRecord;
    }

    public String getStationID() {
        return stationID;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public Double getRainTime() {
        return rainTime;
    }

    public Double getRainRecord() {
        return rainRecord;
    }

    @Override
    public String toString() {
        return stationID + " " + stationLocation + " " + String.format("%.2f", rainRecord / (rainTime / 60));
    }

    @Override
    public int compareTo(Rain o) {
        return stationID.compareTo(o.stationID);
    }
}
