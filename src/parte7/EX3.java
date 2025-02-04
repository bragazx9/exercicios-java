package parte7;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia:");
        int dia = sc.nextInt();

        if (dia <= 28 )
        {
            System.out.println("todos os meses tem esse dia");
        }
        else if (dia <= 30)
        {
            System.out.println("Apenas os meses: Abril, Junho, Setembro, Novembro tem esses dias");
        }
        else if (dia <= 31)
        {
            System.out.println("Apenas os meses: Janeiro, Março, Maio, Julho, Agosto, Outubro e Dezembro tem esses dias");
        }
        else
        {
            System.out.println("Dia digitado invalido");
        }
        sc.close();
    }
}
