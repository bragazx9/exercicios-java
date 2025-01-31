package parte4;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = sc.nextInt();

        int diferenca = num1 - num2;

        if (diferenca < 0)
        {
            System.out.println("A diferença entre os dois numeros é negativa");
        }
        else
        {
            System.out.println("A diferença entre os dois numeros não é negativa");
        }
        sc.close();
    }
}
