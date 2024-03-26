package polymorphism.shapes;

public class Triangle implements Shapeable {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        checkTriangleExistence();
    }

    @Override
    public double getArea() {
        double semiperimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
    }

    private void checkTriangleExistence() {
        if (!((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA)) {
            throw new IllegalArgumentException("Triangle with sides " + sideA + ", " +
                    sideB + ", and " + sideC + " does not exist.");
        }
    }
}
