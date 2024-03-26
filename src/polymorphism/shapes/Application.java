package polymorphism.shapes;


public class Application {
    public static void main(String[] args) {
        Shapeable[] shapes = new Shapeable[]{
                new Triangle(14, 10, 20),
                new Square(20),
                new Circle(19)
        };

        System.out.println("ShapeUtils.sumAreas(shapes) = " + ShapeUtils.sumAreas(shapes));
    }
}
