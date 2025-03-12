package ProgramaTriangulo;

class Retangulo {

    private double width;
    private double height;

    public Retangulo (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}