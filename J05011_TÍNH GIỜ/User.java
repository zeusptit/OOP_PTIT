public class User implements Comparable<User>{
    private String userId;
    private String userName;
    private String timeIn, timeOut;

    public User(String userId, String userName, String timeIn, String timeOut) {
        this.userId = userId;
        this.userName = userName;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }
    public int getTime(String time){
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
    }
    public int getUsingTime(){
        return getTime(timeOut) - getTime(timeIn);
    }

    @Override
    public String toString() {
        return userId + " " + userName + String.format(" %d gio %d phut", getUsingTime() / 60, getUsingTime() % 60);
    }

    @Override
    public int compareTo(User o) {
        if((getUsingTime() / 60) != (o.getUsingTime() / 60)){
            return (o.getUsingTime() / 60) - (getUsingTime() / 60);
        }
        return (o.getUsingTime() % 60) - (getUsingTime() % 60);
    }
}
