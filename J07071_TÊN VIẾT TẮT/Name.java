public class Name implements Comparable<Name>{
    private String name;
    private String nickName;
    private String ten, ho;

    public Name(String name) {
        this.name = name;
        String[] s = name.split("\\s+");
        nickName = "";
        for (int i = 0; i < s.length - 1; ++i)
            nickName += String.valueOf(s[i].charAt(0) + ".");
        ten = s[s.length - 1];
        ho = s[0];
        nickName += String.valueOf(ten.charAt(0));
    }

    public boolean compare(String s){
        if(s.length() != nickName.length())return false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*')
                continue;
            if(s.charAt(i) != nickName.charAt(i))
                return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name o) {
        if(!ten.equals(o.ten))
            return ten.compareTo(o.ten);
        return ho.compareTo(o.ho);
    }
}