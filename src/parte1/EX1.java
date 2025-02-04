package parte1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.println("O numero é positivo");
        } else if (num1 < 0) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é zero");
        }
        scanner.close();


    }
    }

