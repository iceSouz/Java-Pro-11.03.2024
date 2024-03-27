package polymorphism.shapes;

public class Square implements Shapeable {
    private double side;

    public Square(double side) {
        this.side = side;
        checkSquareExistence();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    private void checkSquareExistence() {
        if (side <= 0) {
            throw new IllegalArgumentException("A square with a side length of " + side + " cannot exist.");
        }
    }
}
