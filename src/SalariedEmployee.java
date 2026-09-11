public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssNumber, double weeklySalary){
        super(firstName,lastName,ssNumber);     //call to super sends shared employee info to employee constructor
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void print(){
        super.print();
        System.out.printf("Weekly Salary: $%,.2f%n", weeklySalary);
    }
}
