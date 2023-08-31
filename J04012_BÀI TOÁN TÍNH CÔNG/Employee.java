public class Employee {
    public static int count = 1;
    private String employeeID;
    private String employeeName;
    private int salaryPerDay, salaryPerMonth, bonus, allowance, salaryFinal;
    private int dayOfWork;
    private String employeePos;

    public Employee(String employeeName, int salaryPerDay, int dayOfWork, String employeePos) {
        this.employeeID = "NV" + String.format("%02d", count++);
        this.employeeName = employeeName;
        this.salaryPerDay = salaryPerDay;
        this.dayOfWork = dayOfWork;
        this.salaryPerMonth = this.salaryPerDay * this.dayOfWork;
        if(dayOfWork >= 25)this.bonus += this.salaryPerMonth / 5;
        else if(dayOfWork >= 22)this.bonus += this.salaryPerMonth / 10;
        this.employeePos = employeePos;
        if(employeePos.equals("GD"))this.allowance += 250000;
        else if(employeePos.equals("PGD"))this.allowance += 200000;
        else if(employeePos.equals("TP"))this.allowance += 180000;
        else this.allowance += 150000;
        this.salaryFinal = this.salaryPerMonth + this.bonus + this.allowance;
    }

    @Override
    public String toString() {
        return employeeID + " " + employeeName + " " + salaryPerMonth + " " + bonus + " " + allowance + " " + salaryFinal;
    }
}