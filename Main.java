import java.util.LinkedList;
import java.util.List;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.ShapeAccumulator;
import shapes.Square;
import shapes.Triangle;


public class Main {
   public static void main(String[] args) {
       int max = 10;
       ShapeAccumulator shapeAccumulator = new ShapeAccumulator();
       LinkedList<Rectangle> rectangles = new LinkedList<>(List.of(
               new Rectangle(Math.random() * max, Math.random() * max),
               new Rectangle(Math.random() * max, Math.random() * max)
       ));
       shapeAccumulator.addAll(rectangles);
       shapeAccumulator.addAll(List.of(
               new Triangle(6.0, 7.0, 4.0),
               new Square(Math.random() * max)
       ));
       shapeAccumulator.add(new Circle(Math.random() * max));
       shapeAccumulator.add(new Rectangle(Math.random() * max, Math.random() * max));
       System.out.println("ShapesAccumulator values:");
       for (Shape shape: shapeAccumulator) {
           System.out.println(shape);
       }
       System.out.println("Total area: " + shapeAccumulator.getTotalArea());
       System.out.println("Total perimeter: " + shapeAccumulator.getTotalPerimeter());
       Shape minPerimeterShape = shapeAccumulator.getMinPerimeterShape();
       Shape maxPerimeterShape = shapeAccumulator.getMaxPerimeterShape();
       Shape minAreaShape = shapeAccumulator.getMinAreaShape();
       Shape maxAreaShape = shapeAccumulator.getMaxAreaShape();
       System.out.println("Minimal perimeter: " + minPerimeterShape.getPerimeter() + ", shape: " + minPerimeterShape);
       System.out.println("Maximal perimeter: " + maxPerimeterShape.getPerimeter() + ", shape: " + maxPerimeterShape);
       System.out.println("Minimal area: " + minAreaShape.getArea() + ", shape: " + minAreaShape);
       System.out.println("Maximal area: " + maxAreaShape.getArea() + ", shape: " + maxAreaShape);
   }
}

