// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Create an array of Shape objects
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Circle(3.0);

        // Calculate and display the areas of shapes using polymorphism
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            if (shape instanceof Circle) {
                System.out.println("Circle Area: " + area);
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle Area: " + area);
            }
        }
    }
}
