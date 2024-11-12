package SchoolTest;

public class Circliner extends Circle {
    private double height;

    public Circliner() {
    }

    public Circliner(double height) {
        this.height = height;
    }

    public Circliner(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return area() * 2 + periment() * height;
    }

    public double volumn() {
        return area() * height;
    }
}
