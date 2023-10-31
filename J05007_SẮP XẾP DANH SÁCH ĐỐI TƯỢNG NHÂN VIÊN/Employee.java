public class Employee implements Comparable<Employee>{
    public static int count = 1;
    private String employeeId;
    private String employeeName;
    private String employeeGender;
    private String employeeDob;
    private String employeeAdr;
    private String employeeTaxCode;
    private String employeeSignDay;

    public Employee(String employeeName, String employeeGender, String employeeDob, String employeeAdr, String employeeTaxCode, String employeeSignDay) {
        this.employeeId = String.format("%05d", count++);
        this.employeeName = employeeName;
        this.employeeGender = employeeGender;
        this.employeeDob = employeeDob;
        this.employeeAdr = employeeAdr;
        this.employeeTaxCode = employeeTaxCode;
        this.employeeSignDay = employeeSignDay;
    }
    public int getYear(String employeeDob){
        return Integer.parseInt(employeeDob.substring(6));
    }
    public int getMonth(String employeeDob){
        return Integer.parseInt(employeeDob.substring(3, 5));
    }
    public int getDay(String employeeDob){
        return Integer.parseInt(employeeDob.substring(0, 2));
    }

    @Override
    public String toString() {
        return employeeId + " " + employeeName + " " + employeeGender + " " + employeeDob + " " + employeeAdr + " " + employeeTaxCode + " " + employeeSignDay;
    }

    @Override
    public int compareTo(Employee o) {
        if(getYear(this.employeeDob) != getYear(o.employeeDob))
            return getYear(this.employeeDob) - getYear(o.employeeDob);
        else if(getMonth(this.employeeDob) != getMonth(o.employeeDob))
            return getMonth(this.employeeDob) - getMonth(o.employeeDob);
        return getDay(this.employeeDob) - getDay(o.employeeDob);
    }
}
