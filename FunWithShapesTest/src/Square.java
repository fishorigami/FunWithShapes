public class Square extends Shape{
    public Square(ShapeDescription description) {
        super(description);
        side = description.getDoubles().get(0);
        if (!validate()) {
            System.out.println("Invalid square");
        }
    }
    private double side;

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    protected boolean validate() {
        if (side > 0)
            return true;
        else
            return false;
    }
}
