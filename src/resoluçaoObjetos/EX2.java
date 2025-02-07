package resoluçaoObjetos;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = sc.nextInt();

        sc.close();
        somaDosNumeros(num1, num2);


    }
        public static void somaDosNumeros (int num1, int num2) {

            int dif = num1 - num2;

            if (dif < 0) {
                System.out.println("A diferença entre os dois numeros é negativa");
            }
            else
            {
                System.out.println( "A diferença entre os dois numeros não é negativa");
            }
        }
}
