public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape = new Shape("red", false);
//      Circle
        Circle circle = new Circle();
        circle = new Circle(3.5);
        circle = new Circle(3.5, "indigo", false);
//      Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle = new Rectangle(2.0,5.0);
        rectangle = new Rectangle(3.0,6.0, "yellow",false);
//      Square
        Square square = new Square();
        square = new Square(2.3);
        square = new Square(5.8, "yellow", true);
    }
}