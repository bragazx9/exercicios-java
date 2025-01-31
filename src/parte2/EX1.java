package parte2;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        int nota1 = sc.nextInt();
        System.out.println("Digite sua segunda nota:");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2) / 2;

        if (media >= 7)
        {
            System.out.println("Você foi aprovado");
        }
        else {
            System.out.println("Você não foi aprovado");
        }
        sc.close();
    }
}
