package ForDoWhile;

import java.util.Scanner;

public class ativ45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor maximo da sequência de fibonacci:");
        int max = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Sequência de fibonacci:");
        do {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        } while (a <= max);

        scanner.close();
    }
}
