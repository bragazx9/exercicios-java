package parte1;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro numero");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O numero maior é:" + num1);
        }
                else if (num1 < num2){
                System.out.println("O numero maior é:" + num2);
            }
                else System.out.println("Os numeros sao iguais");
                scanner.close();


        }
}
