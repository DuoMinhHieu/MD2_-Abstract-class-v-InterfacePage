public class Circle extends  Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Change size");
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}