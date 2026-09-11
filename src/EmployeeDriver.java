public class EmployeeDriver {
    public static void main(String[] args){
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-111-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-222-2222",25,32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-333-3333",19,47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        joe.print();
        System.out.println();

        stephanie.print();
        System.out.println();

        mary.print();
        System.out.println();

        nicole.print();
        System.out.println();

        renwa.print();
        System.out.println();

        mike.print();
        System.out.println();

        mahnaz.print();
    }
}
