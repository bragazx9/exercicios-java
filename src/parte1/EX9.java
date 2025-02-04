package parte1;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        if (num >= 10 && num <=50 ){
            System.out.println("O numero esta entre 10 e 50");
        }
        else {
            System.out.println("o numero não esta entre 10 e 50");
        }
        sc.close();
    }
}
