package parte5;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Você é uma criança");
        } else if (idade < 18) {
            System.out.println("Você é um adolescente");
        } else if (idade < 65) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }
        sc.close();
    }
}