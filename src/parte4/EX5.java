package parte4;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = sc.nextInt();

        double raiz = Math.sqrt(num1);

        if (raiz == (int) raiz )
        {
            System.out.println("o numero digitado forma um quadrado perfeito");
        }
        else {
            System.out.println("O numero digitado nao forma um quadrado perfeito");
        }
        sc.close();
    }

}
