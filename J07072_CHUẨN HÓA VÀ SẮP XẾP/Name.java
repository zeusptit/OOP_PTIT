public class Name implements Comparable<Name>{
    private String name;
    private String ten;

    public Name(String name) {
        StringBuilder sb = new StringBuilder();
        String[] word = name.split(" ");
        for(String x : word){
            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
                this.ten = x;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        this.name = sb.toString();
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name o) {
        if(!this.ten.equals(o.ten))
            return this.ten.compareTo(o.ten);
        return this.name.compareTo(o.name);
    }
}
