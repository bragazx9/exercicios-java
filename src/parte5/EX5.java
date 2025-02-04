package parte5;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Cº");
        int temp = sc.nextInt();

        if (temp < 15) {
            System.out.println("Está frio");
        } else if (temp < 25) {
            System.out.println("Está agradável");
        } else {
            System.out.println("Está calor");
        }
        sc.close();
    }
}
