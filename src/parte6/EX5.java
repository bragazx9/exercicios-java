package parte6;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor > 200.00) {
            System.out.println("O cliente tem direito a um brinde");
        } else {
            System.out.println("Valor mínimo para brinde não atingido");
        }
        sc.close();
    }
}