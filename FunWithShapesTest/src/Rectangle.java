public class Rectangle extends Shape{
    public Rectangle(ShapeDescription description) {
        super(description);
        height = description.getDoubles().get(0);
        width = description.getDoubles().get(1);
        if (!validate()) {
            System.out.println("Invalid rectangle");
        }
    }
    private double height;
    private double width;

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }

    protected boolean validate() {
        if (height > 0 && width > 0)
            return true;
        else
            return false;
    }
}
