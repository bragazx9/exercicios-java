package ForDoWhile;

import java.util.Scanner;

public class ativ43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();
        int sum = 0;

        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);

        System.out.println("A soma dos numeros é: " + sum);
        scanner.close();
    }
}
