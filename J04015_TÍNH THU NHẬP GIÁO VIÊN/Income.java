public class Income {
    private String id, name;
    private int salary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public int getLevel(String id){
       return  Integer.parseInt(id.substring(2));
    }

    public Income(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getAllowance(String id){
        String temp = id.substring(0, 2);
        if(temp.equals("HT"))
            return 2000000;
        else if(temp.equals("HP"))
            return 900000;
        else
            return 500000;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getLevel(id) + " " +  getAllowance(id) + " " + (getSalary() * getLevel(id) + getAllowance(id)) ;
    }
}