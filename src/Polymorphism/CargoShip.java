package Polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity){
        super(name, yearBuilt);
       setCargoCapacity(cargoCapacity);
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        if (cargoCapacity < 0){
            throw new IllegalArgumentException("Cargo Capacity cannot be negative");
        }
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void print() {
        System.out.println("Cargo Ship Name: " + getName());
        System.out.println(
                "Cargo Capacity: " + cargoCapacity + " tons");
    }

}
