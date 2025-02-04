package parte5;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe sua altura em centimetros: ");
        int alt = sc.nextInt();


        if (alt < 170) {
            System.out.println("Você é baixo");
        } else if (alt < 180) {
            System.out.println("Você é mediano");
        } else {
            System.out.println("Você é alto");
        }
        sc.close();

    }
}