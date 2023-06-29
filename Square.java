public class Square extends Rectangle {
    private double side;
    public Square() {
    }

    public Square(double width, double length, double side) {

        super(width, length);
        this.side = side;
    }

    public Square(String color, Boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
}
