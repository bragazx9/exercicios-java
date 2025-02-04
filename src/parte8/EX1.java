package parte8;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = sc.nextInt();
        System.out.println("Digite outro numero");
        int num2 = sc.nextInt();

        if (num > 0 && num2 > 0 ) {
            System.out.println("Os dois numeros sao positivos");
        }
        else if (num < 0 && num2 < 0)
        {
            System.out.println("Os dois numeros sao negativos");
        }
        else {
            System.out.println("Os sinais dos numeros sao diferentes");
        }
        sc.close();
    }
}
