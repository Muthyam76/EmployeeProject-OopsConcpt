public class ContractEmployee extends Employee{
    private double wagePerHour;

    ContractEmployee(String employeeName,double wagePerHour ){
        super(employeeName);
        this.wagePerHour=wagePerHour;
        int id=getContractIdCounter();
        employeeId="c"+id;
        setContractIdCounter(++id);
    }
    public void calculateSalary(float hoursWorked){
        double salary = hoursWorked * wagePerHour;
        setSalary(salary);
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "wagePerHour=" + wagePerHour +
                '}';
    }
}
