package ForDoWhile;

import java.util.Scanner;

public class ativ39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite um numero:");
            num = scanner.nextInt();
            if (num >= 0) {
                System.out.println("numero positivo: " + num);
            }
        } while (num >= 0);

        scanner.close();
    }
}
