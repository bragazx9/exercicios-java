package parte9;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a idade da pessoa");
        int idade = sc.nextInt();

        System.out.println("Escreva o peso da pessoa");
        double peso = sc.nextDouble();
        sc.nextLine();

        if (idade > 18 && idade < 65 && peso >= 50) {
            System.out.println("Apta para doar sangue");
        } else {
            System.out.println("nao pode doar sangue");
        }
        sc.close();
    }
}
