// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Car myCar = new Car("Toyota", 2022, 4);
        Bicycle myBicycle = new Bicycle("Schwinn", 2021, 7);

        // Demonstrate inheritance and method overriding
        System.out.println("Car Information:");
        myCar.displayInfo();
        myCar.start();
        myCar.honk();
        myCar.stop();

        System.out.println("\nBicycle Information:");
        myBicycle.displayInfo();
        myBicycle.start();
        myBicycle.ringBell();
        myBicycle.stop();

    /*
                char[] s = new char[5];
        for (int i = 0; i < 5; i++) {
            int intValue = 65 + i; // Calculate the integer value

            s[i]=(char) intValue;
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("char= " + s[i]);
        }
        System.out.println("Characters in the array:");
        for (char c : s) {
            System.out.println(c);
        }*/
    }
}
