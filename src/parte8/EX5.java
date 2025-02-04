package parte8;

import java.util.Random;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        int tentativa;
        int numeroAleatorio = num.nextInt(10) + 1;

        do {
            System.out.println(" Digite um numero entre 10 e 1");
            tentativa = sc.nextInt();
        }
        while (tentativa != numeroAleatorio);
        System.out.println("Você diitou o numero certo");

        sc.close();
    }
}
