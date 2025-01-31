package parte3;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();


        if (palavra.length() > 5)
        {
            System.out.println("A palavra digitada contem mais de 5 letras");
        }
        else
        {
            System.out.println("A palavra digitada nao contem 5 letras ou mais.");
        }
        sc.close();
    }
}
