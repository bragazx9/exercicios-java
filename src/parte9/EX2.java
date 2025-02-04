package parte9;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha de acesso: ");
        int senha = sc.nextInt();

        int senhaVerdadeira = 2313;

        if (senha == senhaVerdadeira) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}