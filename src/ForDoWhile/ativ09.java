package ForDoWhile;

import java.util.Scanner;

public class ativ09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10;i++){
            System.out.println(num + "x" + i + " = "  + i * num);
        }
        sc.close();
    }
}
