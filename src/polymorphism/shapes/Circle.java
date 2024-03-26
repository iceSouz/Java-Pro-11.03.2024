package polymorphism.shapes;

import polymorphism.constants.MathConstants;

public class Circle implements Shapeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        checkCircleExistence();
    }

    @Override
    public double getArea() {
        return radius * radius * MathConstants.PI;
    }

    private void checkCircleExistence() {
        if (radius <= 0) {
            throw new IllegalArgumentException("A circle with a radius length of " + radius + " cannot exist.");
        }
    }
}
