public class Employee {
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

    @Override
    public String toString() {
        return employeeId + " " + employeeName + " " + employeeGender + " " + employeeDob + " " + employeeAdr + " " + employeeTaxCode + " " + employeeSignDay;
    }
}