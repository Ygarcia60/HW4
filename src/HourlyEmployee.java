public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(
            String firstName,
            String lastName,
            String ssNumber,
            double wage,
            double hoursWorked
    ){
        super(firstName,lastName,ssNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }
    public void setWage(double wage){
        this.wage = wage;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void print(){
        super.print();
        System.out.printf("Wage $%.2f%n", wage);
        System.out.printf("Hours worked: %.2f%n", hoursWorked);
    }

}
