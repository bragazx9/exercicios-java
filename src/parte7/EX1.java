package parte7;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um horario entre 0h e 24h:");
        int horario = sc.nextInt();

        if (horario > 24 || horario < 0)
        {
            System.out.println("O horario digitado é invalido");
        }
        else
        {
            System.out.println("O horario digitado é valido");
        }
        sc.close();
    }
}
