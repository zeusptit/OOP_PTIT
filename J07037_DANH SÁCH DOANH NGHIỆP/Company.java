public class Company implements Comparable<Company>{
    private String id;
    private String name;
    private String intern;

    public Company(String id, String name, String intern) {
        this.id = id;
        this.name = name;
        this.intern = intern;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + intern;
    }
    @Override
    public int compareTo(Company o){
        return this.id.compareTo(o.id);
    }
}
