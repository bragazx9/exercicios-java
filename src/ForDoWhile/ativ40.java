package ForDoWhile;

import java.util.Scanner;

public class ativ40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num;

        do {
            System.out.println("Digite um numero:");
            num = scanner.nextInt();
            count++;
        } while (num != 0);

        System.out.println("voce digitou " + (count - 1) + " numeros antes do zero.");
        scanner.close();
    }
}
