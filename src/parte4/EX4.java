package parte4;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = sc.nextInt();
        System.out.println("Digite um segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Digite um terceiro numero");
        int num3 = sc.nextInt();

        if ( num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1)
        {
            System.out.println("Os numeros formam um triangulo");
        }
        else {
            System.out.println("Os numeros nao formam um triangulo");
        }
        sc.close();
    }

}
