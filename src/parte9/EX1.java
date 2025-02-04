package parte9;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a placa de um veiculo:");
        String placa = sc.nextLine();

        char guarda = placa.charAt(placa.length() - 1);

        int placaFinal = guarda;

        if (placaFinal % 2 == 0)
        {
            System.out.println("termina em par");
        }
        else
        {
            System.out.println("nao termina em par");
        }
        sc.close();
    }
}
