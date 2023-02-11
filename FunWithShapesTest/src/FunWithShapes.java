import java.util.Vector;

public class FunWithShapes extends ShapeHandler {
    public static void main(String[] args) {
        try {
            FunWithShapes fun = new FunWithShapes();
            double area = fun.sumOverAreas();
            double perimeter = fun.sumOverPerimeters();

            System.out.println(area);
            System.out.println(perimeter);
        } catch(ShapeException e) {
            System.out.println(e);
        }


    }

    public FunWithShapes() throws ShapeException {
        super();        
        // test code
        /*
        ShapeDescription c = new ShapeDescription("circle 2.4");
        Circle circle = new Circle(c);
        ShapeDescription s = new ShapeDescription("square 2.2");
        Square square = new Square(s);
        ShapeDescription t = new ShapeDescription("triangle 3.2, 4.5, 5.0");
        Triangle triangle = new Triangle(t);
        ShapeDescription r = new ShapeDescription("rectangle 5.6, 2.3");
        Rectangle rectangle = new Rectangle(r);
        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(triangle.getArea());
        System.out.println(rectangle.getArea());

        shapes = new Vector<Shape>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        shapes.add(rectangle);

         */
    }

    public void convertDescriptionsToShapes() {
        shapes = new Vector<Shape>();
        for (ShapeDescription sd: shapeDescriptions) {
            switch (sd.getShapeType()) {
                case CIRCLE:
                    Circle c = new Circle(sd);
                    shapes.add(c);
                    break;
                case SQUARE:
                    Square s = new Square(sd);
                    shapes.add(s);
                    break;
                case TRIANGLE:
                    Triangle t = new Triangle(sd);
                    shapes.add(t);
                    break;
                case RECTANGLE:
                    Rectangle r = new Rectangle(sd);
                    shapes.add(r);
                    break;
            }

/*
            if (sd.getShapeType() == ShapeDescription.ShapeTypes.CIRCLE) {
                Circle c = new Circle(sd);
                shapes.add(c);
            } else if (sd.getShapeType() == ShapeDescription.ShapeTypes.SQUARE) {
                Square s = new Square(sd);
                shapes.add(s);
            } else if (sd.getShapeType() == ShapeDescription.ShapeTypes.RECTANGLE) {
                Rectangle r = new Rectangle(sd);
                shapes.add(r);
            } else if (sd.getShapeType() == ShapeDescription.ShapeTypes.TRIANGLE) {
                Triangle t = new Triangle(sd);
                shapes.add(t);
            }*/
        }
    }

    public double sumOverAreas() {
        double area = 0;
        for (Shape shape: shapes) {
            area += shape.getArea();
        }
        return area;
    }

    public double sumOverPerimeters() {
        double perimeter = 0;
        for (Shape shape: shapes) {
            perimeter += shape.getPerimeter();
        }
        return perimeter;
    }
    
    protected Vector<Shape> shapes;
}