package shapes;

import java.util.*;


public final class ShapeAccumulator implements Iterable<Shape> {
    private final ArrayList<Shape> shapes;

    public ShapeAccumulator() {
        shapes = new ArrayList<>();
    }

    public final void add(Shape shape) {
        shapes.add(shape);
    }

    public final void addAll(Collection<Shape> collection) {
        shapes.addAll(collection);
    }

    public final Shape getMaxAreaShape() {
        return shapes.stream().max(Comparator.comparing(Shape::getArea)).get();
    }

    public final Shape getMinAreaShape() {
        return shapes.stream().min(Comparator.comparing(Shape::getArea)).get();
    }

    public final Shape getMaxPerimeterShape() {
        return shapes.stream().max(Comparator.comparing(Shape::getPerimeter)).get();
    }

    public final Shape getMinPerimeterShape() {
        return shapes.stream().min(Comparator.comparing(Shape::getPerimeter)).get();
    }

    public final double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public final double getTotalPerimeter() {
        double totalPerimeter= 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.getPerimeter();
        }
        return totalPerimeter;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ShapeAccumulator && shapes == ((ShapeAccumulator)other).shapes;
    }

    @Override
    public int hashCode() {
        return shapes.hashCode();
    }

    @Override
    public Iterator<Shape> iterator() {
        return shapes.iterator();
    }
}

