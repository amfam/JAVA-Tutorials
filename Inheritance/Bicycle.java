public class Bicycle extends Vehicle{
    private int numberOfGears;

    public Bicycle(String brand, int year, int numberOfGears) {
        super(brand, year); // Call the constructor of the superclass
        this.numberOfGears = numberOfGears;
    }

    public void ringBell() {
        System.out.println("Ring the bicycle bell.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Number of Gears: " + numberOfGears);
    }

}
