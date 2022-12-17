public class Admin {
    void generateSalarySlip(Employee employees[],float salaryFactor[]){
        int n=employees.length;
        for(int i=0;i<n;i++){
            employees[i].calculateSalary(salaryFactor[i]);

        }

    }

}