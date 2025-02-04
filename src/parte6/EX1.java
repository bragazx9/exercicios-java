package parte6;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe seu saldo: ");
        float saldo = sc.nextFloat();


        if (saldo > 20) {
            System.out.println("É possivel realizar um saque");
        } else {
            System.out.println("Saldo insuficiente para realizar um saque");
        }
        sc.close();
    }
}
