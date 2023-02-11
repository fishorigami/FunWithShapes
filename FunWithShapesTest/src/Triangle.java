public class Triangle extends Shape{
    public Triangle(ShapeDescription description) {
        super(description);
        side1 = description.getDoubles().get(0);
        side2 = description.getDoubles().get(1);
        side3 = description.getDoubles().get(2);
        if (!validate()) {
            System.out.println("Invalid triangle");
        }
    }
    private double side1;
    private double side2;
    private double side3;

    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        double root = semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3);
        return Math.sqrt(root);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    protected boolean validate() {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            return false;

        // no one side can be equal or longer than the other two combined
        if (side1 >= side2 + side3)
            return false;
        if (side2 >= side1 + side3)
            return false;
        if (side3 >= side1 + side2)
            return false;

        return true;
    }
}

