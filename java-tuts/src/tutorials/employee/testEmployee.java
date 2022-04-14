package tutorials.employee;

public class testEmployee {
    public static void main(String[] args){
        Employee[] list = new Employee[3];

        list[0] = new Executive("Ammar Hazrin", 100000);
        list[1] = new HourlyEmployee("Arif Busuk", 5);
        list[2] = new MonthlyEmployee("Sabrina Shah", 9000);

        ((Executive)list[0]).awardBonus(20000);

        for(int i = 0; i < list.length; i++)
            if(list[i] instanceof HourlyEmployee)
                ((HourlyEmployee)list[i]).addHours(80);
        for(int i = 0; i < list.length; i++){
            list[i].print();
            System.out.println("Paid: " + list[i].pay());
            System.out.println("*********************************");
        }
    }
}
