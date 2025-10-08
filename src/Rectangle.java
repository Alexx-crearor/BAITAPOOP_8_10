public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point centerPoint, double width, double height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle(centerPoint=%s, width=%s, height=%s)",
                this.centerPoint, this.width, this.height);
    }
}
