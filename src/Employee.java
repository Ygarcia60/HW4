public class Employee {
    private String firstName;
    private String lastName;
    private String ssNumber ;

    public Employee(String firstName, String lastName, String ssNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssNumber = ssNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getSSNumber(){
        return ssNumber;
    }

    public void setSSNumber(String ssNumber){
        this.ssNumber = ssNumber;
    }

    public void print(){
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Social Security number: " + ssNumber);
    }
}
