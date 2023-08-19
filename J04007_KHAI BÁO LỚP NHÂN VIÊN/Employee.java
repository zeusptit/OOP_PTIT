public class Employee {
    private String id, name, sex, dob, adress, code, day;

    public Employee(String name, String sex, String dob, String adress, String code, String day) {
        this.id = "00001";
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.adress = adress;
        this.code = code;
        this.day = day;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + dob + " " + adress + " " + code + " " + day;
    }
}
