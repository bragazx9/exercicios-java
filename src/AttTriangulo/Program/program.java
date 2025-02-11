package AttTriangulo.Program;

import AttTriangulo.Objetos.Objeto;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Objeto x = new Objeto();
        Objeto y = new Objeto();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle x: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.2f%n", areaX);
        System.out.printf("Triangle y area: %.2f%n", areaY);

        System.out.println(x.total(x,y));
        sc.close();
    }
}
