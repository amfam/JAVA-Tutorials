public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Accessing and displaying information
        System.out.println("Original Information:");
        person.displayInfo();

        // Modifying attributes
        person.setName("Bob");
        person.setAge(25);

        // Displaying updated information
        System.out.println("\nUpdated Information:");
        person.displayInfo();
       // Use the getter method to retrieve the name
        String personName = person.getName();

        // Display the retrieved name
        System.out.println("Person's Name: " + personName);
    }
}
