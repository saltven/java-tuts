package tutorials.employee;

import tutorials.employee.Employee;

public class Executive extends Employee {
    private double bonus;

    public Executive(String exName, double exRate){
        super(exName,exRate);
        bonus = 0;
    }

    public void awardBonus(int amount){
       bonus = amount;
   }

    public double pay(){
        double paycheck = payRate + bonus;
        bonus = 0;
        return paycheck;
    }

     public void print(){
        super.print();
        System.out.println("Current bonus: " + bonus);
    }
}
