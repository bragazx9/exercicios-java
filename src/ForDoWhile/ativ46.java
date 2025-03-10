package ForDoWhile;

import java.util.Scanner;

public class ativ46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número:");
        int num = scanner.nextInt();
        int i = 1;

        System.out.println("Os primeiros 10 múltiplos de " + num + " é:");
        do {
            System.out.println(num * i);
            i++;
        } while (i <= 10);

        scanner.close();
    }
}
