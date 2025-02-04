package parte7;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um mes em numero");
        int mes = sc.nextInt();

        if (mes > 12 && mes > 0)
        {
            System.out.println("Mes invalido");
        }
        else {
            System.out.println(" mes valido");
        }
            sc.close();
    }
}
