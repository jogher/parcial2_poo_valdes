public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){

    }
    public Circle(double radius){

    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetre() {
        return 0;
    }

    @Override
    public Boolean getFilled() {
        return super.getFilled();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}