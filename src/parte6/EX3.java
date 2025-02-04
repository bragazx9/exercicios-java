package parte6;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        float salario = sc.nextFloat();


        if (salario >= 3000.00) {
            System.out.println("Você pode financiar um imóvel");
        } else {
            System.out.println("Você não pode financiar um imóvel");
        }
        sc.close();
    }
}
