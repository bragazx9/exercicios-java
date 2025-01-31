package parte2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        int nota1 = sc.nextInt();

        if (nota1 >= 7)
        {
            System.out.println("Você foi aprovado");
        }
        else if (nota1 >= 5 && nota1 < 7)
        {
            System.out.println("Você está de recuperaçao");
        }
        else {
            System.out.println("Você foi reprovado");
        }
        sc.close();
    }
}
