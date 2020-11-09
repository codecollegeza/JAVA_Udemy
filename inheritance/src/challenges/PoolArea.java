package challenges;

class Rectangle {

    private final double width;
    private final double length;

    Rectangle(double width, double length) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }

        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (width * length);
    }
}

class Cuboid extends Rectangle {

    private final double height;

    Cuboid(double width, double length, double height) {
        super(width, length);
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * height);
    }
}

public class PoolArea {

}
