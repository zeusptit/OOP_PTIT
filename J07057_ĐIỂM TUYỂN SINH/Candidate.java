public class Candidate implements Comparable<Candidate> {
    public static int count = 1;
    private String id;
    private String name;
    private double score;
    private String role;
    private int area;
    private String mod;
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
    public Candidate(String name, double score, String role, int area) {
        this.id = "TS" + String.format("%02d", count++);
        this.name = stdName(name);
        this.score = score;
        this.role = role;
        this.area = area;
        if(role.compareTo("Kinh") != 0)this.score += 1.5;
        switch (area){
            case 1:
                this.score += 1.5;
                break;
            case 2:
                this.score += 1;
                break;
            default:
                break;
        }
        if(this.score >= 20.5)this.mod = "Do";
        else this.mod = "Truot";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", score) + " " + mod;
    }

    @Override
    public int compareTo(Candidate o) {
        if(o.score < this.score)
            return -1;
        else if(o.score > this.score)
            return 1;
        return this.id.compareTo(o.id);
    }
}
