public class PermanentEmployee extends Employee {
    private double basicPay;
    private String salaryComponents[];
    private float experience;
    Asset assets[];
    PermanentEmployee(String employeeName,double basicPay,String salaryComponents[],Asset assets[]){
        super(employeeName);
        this.basicPay=basicPay;
        this.salaryComponents=salaryComponents;
        this.assets=assets;
        int id=getPermanentIdCounter();
        employeeId="E"+id;
        setPermanentIdCounter(++id);
    }
    double calculateBonus(float experience) {
        return 1000;

    }

    @Override
    void calculateSalary(float experience) {
        setExperience(experience);
        String a=salaryComponents[0];
        a=a.substring(3);
        int da=Integer.parseInt(a);
        a=salaryComponents[1];
        a=a.substring(4);
        int hra=Integer.parseInt(a);
        double salary = basicPay+da+hra+calculateBonus(experience);
        setSalary(salary);


    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public String[] getSalaryComponents() {
        return salaryComponents;
    }

    public void setSalaryComponents(String[] salaryComponents) {
        this.salaryComponents = salaryComponents;
    }
}

