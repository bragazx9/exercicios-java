package parte7;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        int datainicial = 10;
        int datafinal = 20;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma data");
        int data = sc.nextInt();

        if (data >= datainicial && datafinal <= 20)
        {
            System.out.println("A data esta dentro do periodo");
        }
        else
        {
            System.out.println("A data nao esta dentro do periodo");
        }
             sc.close();
    }
}
