package Polymorphism;

public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // get and set methods
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    public void print(){
        System.out.println("Ship name: "+ name);
        System.out.println("Year Built: "+ yearBuilt);
    }
}
