package parte3;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome");
        String nome = sc.nextLine();

        if (!nome.isEmpty() && nome.toLowerCase().startsWith("a"))
        {
            System.out.println("O nome digitado começa com a letra 'A'");
        }
        else
        {
            System.out.println("O nome digitado não começa com a letra 'A' ");
        }
        sc.close();
    }
}
