package tutorials.employee;

abstract class Employee {
    protected String name;
    protected double payRate;

    public Employee(String empName, double empRate){
        name = empName;
        payRate = empRate;
    }

    public String getName(){
        return name;
    }

    public void setPayRate(double newRate){
        payRate = newRate;
    }

    abstract public double pay();

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Pay rate: " + payRate);
    }
}




