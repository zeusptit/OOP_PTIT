public class Employee implements Comparable<Employee>{
    public static int count = 1;
    private String employeeID;
    private String employeeName;
    private int employeeSalary;
    private int dayOfWork;
    private String employeePosition;

    public Employee(String employeeName, int employeeSalary, int dayOfWork, String employeePosition) {
        this.employeeID = "NV" + String.format("%02d", count++);
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.dayOfWork = dayOfWork;
        this.employeePosition = employeePosition;
    }
    public int getGross(){
        return employeeSalary * dayOfWork;
    }
    public int getBonus(){
        if(dayOfWork >= 25)return (int) (0.2 * getGross());
        else if(dayOfWork >= 22)return (int)(0.1 * getGross());
        return 0;
    }
    public int getAllowance(){
        if(employeePosition.equals("GD"))return 250000;
        else if(employeePosition.equals("PGD"))return 200000;
        else if(employeePosition.equals("TP"))return 180000;
        return 150000;
    }
    public int getWage(){
        return getGross() + getBonus() + getAllowance();
    }

    @Override
    public String toString() {
        return employeeID + " " + employeeName + " " + getGross() + " " + getBonus() + " " + getAllowance() + " " + getWage();
    }

    @Override
    public int compareTo(Employee o) {
        return o.getWage() - getWage();
    }
}
