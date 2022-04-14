package tutorials.employee;

import tutorials.employee.Employee;

public class HourlyEmployee extends Employee {
    private int hours;

    public HourlyEmployee(String hName, double hRate){
        super(hName, hRate);
        hours = 0;
    }

    public void addHours(int moreHours){
        hours += moreHours;
    }

    public double pay(){
        return payRate * hours;
    }

    public void print(){
        super.print();
        System.out.println("Current hours: " + hours);
    }
}
