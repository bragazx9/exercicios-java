package parte4;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = sc.nextInt();
        System.out.println("Digite um segundo numero");
        int num2 = sc.nextInt();



        if (num1 % num2 == 0)
        {
            System.out.println("O numero é divisivel por:" + num2);
        }
        else
        {
            System.out.println("O numero é divisivel por:" + num1);
        }
        sc.close();
   }
}
