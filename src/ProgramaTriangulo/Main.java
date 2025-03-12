package ProgramaTriangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a largura do retangulo: ");
        double width = scanner.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double height = scanner.nextDouble();

        Retangulo Retangulo = new Retangulo(width, height);

        System.out.printf("Área: %.2f%n", Retangulo.area());
        System.out.printf("Perímetro: %.2f%n", Retangulo.perimeter());
        System.out.printf("Diagonal: %.2f%n", Retangulo.diagonal());

        scanner.close();
    }
}