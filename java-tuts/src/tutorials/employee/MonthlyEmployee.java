package tutorials.employee;

import tutorials.employee.Employee;

public class MonthlyEmployee extends Employee {
    public MonthlyEmployee(String empName, double empRate){
        super(empName, empRate);
    }

    public double pay(){
        return payRate;
    }
}
