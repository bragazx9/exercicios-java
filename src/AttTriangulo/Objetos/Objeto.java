package AttTriangulo.Objetos;

public class Objeto {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String total(Objeto qualquer,Objeto qualqueroutro) {
        String result;
        if (qualquer.area() > qualqueroutro.area()) {
            result = "Larger area: X";
        } else {
            result = "Larger area: Y";
        }
        return result;
    }
}
