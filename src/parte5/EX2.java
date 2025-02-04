package parte5;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe sua faixa de classificação (1 a 30): ");
        int class = sc.nextInt();


        if (class >= 1 && class <= 10) {
            System.out.println("Sua faixa de classificação é: A");
        } else if (class > 10 && class <= 20) {
            System.out.println("Sua faixa de classificação é: B");
        } else if (class > 20 && class <= 30) {
            System.out.println("Sua faixa de classificação é: C");
        } else {
            System.out.println("Número digitado inválido.");
        }
        sc.close();

    }
}
