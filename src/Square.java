public class Square extends Shape {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint);
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format("Square(centerPoint=%s, side=%s)",
                this.centerPoint, this.side);
    }

}
