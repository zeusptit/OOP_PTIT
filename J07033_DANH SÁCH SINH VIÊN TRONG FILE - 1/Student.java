public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private String clas;
    private String email;
    public Student(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }
    public String std(String name){
        StringBuilder sb = new StringBuilder("");
        String[] words = name.split(" ");
        for(String x : words){
            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return id + " " + std(name) + clas + " " + email;
    }
    @Override
    public int compareTo(Student o){
        return this.id.compareTo(o.id);
    }
}
