package parte6;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor de sua compra: ");
        double valor = sc.nextFloat();

        double valorfinal;
        double desconto = 0.1;


        if (valor > 500.00) {
            System.out.println("Valor da Compra: R$" + valor);
            System.out.println("Desconto: R$" + valor * desconto);
            valorfinal = valor * (1 - desconto);
            System.out.println("Valor Final: R$" + valorfinal);
        } else {
            System.out.println("Valor da Compra: R$" + valor);
        }
        sc.close();
    }
}
