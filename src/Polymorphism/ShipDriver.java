package Polymorphism;

public class ShipDriver {
    public static void main(String[] args){
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Ocean Explorer", "2015");
        ships[1] = new CruiseShip("Caribbean Dream", "2020", 3500);
        ships[2] = new CargoShip("Pacific Transporter", "2018", 50000);

        for (Ship ship: ships){
            ship.print();
            System.out.println();
        }
    }
}
