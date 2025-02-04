package parte7;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um horário");
        int horario = sc.nextInt();

        if (horario < 12)
        {
            System.out.print("Está de manha");
        }
        else if (horario > 12 && horario <= 18)
        {
            System.out.print("Está de tarde");
        }
        else if (horario > 18 && horario <= 24)
        {
            System.out.println("Esta de noite");
        }
        else
        {
            System.out.println("Digite um horario valido");
        }
        sc.close();
    }

}
