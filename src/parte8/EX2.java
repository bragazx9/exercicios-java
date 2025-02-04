package parte8;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = sc.nextInt();
        System.out.println("Digite um  segundo numero");
        int num2 = sc.nextInt();

        if (num1 > (num2 * 2))
        {
            System.out.println(num1 + "é maior que o dobro de:" + num2);
        }
        else {
            System.out.println(num1 + "Não é maior que o dobro de:" + num2);
        }
        sc.close();
    }
}
