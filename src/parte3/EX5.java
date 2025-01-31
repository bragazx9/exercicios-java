package parte3;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra1 = sc.nextLine();
        System.out.println("Digite outra palavra");
        String palavra2 = sc.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2))
        {
            System.out.println("As palavras digitas sao iguais");
        }
        else
        {
            System.out.println("As palavras digitadas não são iguais");
        }
        sc.close();
    }
}
