package parte9;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em °C ");
        Double Temp = sc.nextDouble();
        sc.nextLine();

        System.out.print("Deseja fazer a conversão para Kelvin?");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {

            System.out.println("A temperatura em Kelvin: " + (Temp + 273.15) + "Kº");

        } else {
            System.out.printf("Ok!");
        }
        sc.close();
    }
}
