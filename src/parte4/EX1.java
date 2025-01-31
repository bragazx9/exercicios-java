package parte4;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = sc.nextInt();

        if (num1 + num2 >= 100)
        {
            System.out.println("A soma dos dois numeros digitados é maior que 100");
        }
        else
        {
            System.out.println("A soma dos dois numeros não é maior que 100");
        }
        sc.close();
    }
}
