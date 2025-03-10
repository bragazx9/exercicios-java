package ForDoWhile;

import java.util.Scanner;

public class ativ41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        String input = scanner.nextLine();

        int i = 0;
        do {
            System.out.println(input.charAt(i));
            i++;
        } while (i < input.length());

        scanner.close();
    }
}
