package parte5;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe sua faixa de classificação (1 a 30): ");
        int clas = sc.nextInt();


        if (clas >= 1 && clas <= 10) {
            System.out.println("Sua faixa de classificação é: A");
        } else if (clas > 10 && clas <= 20) {
            System.out.println("Sua faixa de classificação é: B");
        } else if (clas > 20 && clas <= 30) {
            System.out.println("Sua faixa de classificação é: C");
        } else {
            System.out.println("Número digitado inválido.");
        }
        sc.close();

    }
}
