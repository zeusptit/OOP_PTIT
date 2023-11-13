public class Employee{
    public static int count = 1;
    private String employeeID;
    private String employeeName;
    private String employeePosition;
    private long employeeSalary;
    private long dayOfWork;

    public Employee(String employeeName, String employeePosition, long employeeSalary, long dayOfWork) {
        this.employeeID = "NV" + String.format("%02d", count++);
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
        this.dayOfWork = dayOfWork;
    }

    public long getGross(){
        return employeeSalary * dayOfWork;
    }
    public long getTemp(){
        if((getAllowance() + getGross()) * 2 / 3 < 25000){
            return (long)Math.round((float) ((getAllowance() + getGross()) * 2) / 3 / 1000)  * 1000;
        }
        return 25000;
    }
    public int getAllowance(){
        if(employeePosition.equals("GD"))return 500;
        else if(employeePosition.equals("PGD"))return 400;
        else if(employeePosition.equals("TP"))return 300;
        else if(employeePosition.equals("KT"))return 250;
        return 100;
    }
    public long getRest(){
        return getGross()  + getAllowance() - getTemp();
    }

    @Override
    public String toString() {
        return employeeID + " " + employeeName + " " + getAllowance() + " " + getGross() + " " + getTemp() + " " + getRest();
    }
}
