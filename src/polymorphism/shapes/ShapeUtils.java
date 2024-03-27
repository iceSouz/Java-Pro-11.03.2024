package polymorphism.shapes;

import java.util.Arrays;

public class ShapeUtils {
    public static double sumAreas(Shapeable[] shapes) {
        double result = 0;

        for (Shapeable shape : shapes) {
            result += shape.getArea();
        }

        return result;
    }
}
