public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call the constructor of the superclass
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("Honking the car horn.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
