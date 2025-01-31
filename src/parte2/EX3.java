package parte2;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        int nota1 = sc.nextInt();
        System.out.println("Digite sua segunda nota:");
        int nota2 = sc.nextInt();
        System.out.println("Digite sua terceira nota:");
        int nota3 = sc.nextInt();

        int maiorNota, menorNota;

        if (nota1 > nota2 && nota1 > nota3) {
            maiorNota = nota1;
        } else if (nota2 > nota1 && nota2 > nota3) {
            maiorNota = nota2;
        } else {
            maiorNota = nota3;
        }
        if (nota1 < nota2 && nota1 < nota3) {
            menorNota = nota1;
        } else if (nota2 < nota1 && nota2 < nota3) {
            menorNota = nota2;
        } else {
            menorNota = nota3;
        }
        System.out.println("A maior nota é:" + maiorNota);
        System.out.println("A menor nota é:" + menorNota);

        sc.close();
    }

}
