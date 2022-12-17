public abstract class Employee {
    String employeeId;
    private String employeeName;
    private double salary;
    private static int contractIdCounter;
    private static int permanentIdCounter;
    Employee(String employeeName){
        this.employeeName=employeeName;
    }
    static{
        contractIdCounter=1000;
        permanentIdCounter=1000;
    }
    abstract void calculateSalary(float hoursWorked);

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getContractIdCounter() {
        return contractIdCounter;
    }

    public static void setContractIdCounter(int contractIdCounter) {
        Employee.contractIdCounter = contractIdCounter;
    }

    public static int getPermanentIdCounter() {
        return permanentIdCounter;
    }

    public static void setPermanentIdCounter(int permanentIdCounter) {
        Employee.permanentIdCounter = permanentIdCounter;
    }
}

