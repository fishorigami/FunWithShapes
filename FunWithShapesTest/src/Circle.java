public class Circle extends Shape {
    public Circle(ShapeDescription description) {
        super(description);
        radius = description.getDoubles().get(0);
        if (!validate()) {
            System.out.println("Invalid circle");
        }
    }
    private double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    protected boolean validate() {
        if (radius > 0)
            return true;
        else
            return false;
    }
}
