public class Salary extends Department{
    private String employeeID;
    private String employeeName;
    private int slrPerDay;
    private int dayOfWork;

    public Salary(String departmentID, String departmentName, String employeeID, String employeeName, int slrPerDay, int dayOfWork) {
        super(departmentID, departmentName);
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.slrPerDay = slrPerDay;
        this.dayOfWork = dayOfWork;
    }

    @Override
    public String toString() {
        return employeeID + " " + employeeName + " " + getDepartmentName() + " " + (slrPerDay * dayOfWork * getCoefficient(employeeID) * 1000);
    }

    public int getCoefficient(String employeeID){
        int temp = Integer.parseInt(employeeID.substring(1, 3));
        char group = employeeID.charAt(0);
        if(1 <= temp && temp <= 3){
            if(group == 'A')return 10;
            else if(group == 'B')return 10;
            else if(group == 'C')return 9;
            return 8;
        }else if(4 <= temp && temp <= 8){
            if(group == 'A')return 12;
            else if(group == 'B')return 11;
            else if(group == 'C')return 10;
            return 9;
        }else if(9 <= temp && temp <= 15){
            if(group == 'A')return 14;
            else if(group == 'B')return 13;
            else if(group == 'C')return 12;
            return 11;
        }else{
            if(group == 'A')return 20;
            else if(group == 'B')return 16;
            else if(group == 'C')return 14;
            return 13;
        }

    }
}
