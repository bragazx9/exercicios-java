package parte5;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe sua Pressão Arterial (PAS): ");
        int pas = sc.nextInt();
        System.out.print("\nInforme sua Pressão Arterial (PAD): ");
        int pad = sc.nextInt();


        if (pas < 140 && pad < 90) {
            System.out.println("Sua Pressão Arterial está Normal");
        } else if (pas < 180 && pad < 110) {
            System.out.println("Sua Pressão Arterial está Moderada");
        } else {
            System.out.println("Sua Pressão Arterial está Alta");
        }
        sc.close();

    }
}
