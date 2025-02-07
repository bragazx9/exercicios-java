package resoluçaoObjetos;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = sc.nextInt();

        sc.close();

        somaDosNumeros(num1, num2);

        textofinal(somaDosNumeros(num1,num2));
    }
    public static String somaDosNumeros(int num1, int num2){
        String t;
        if (num1 + num2 >= 100)
        {
            t = "A soma dos dois numeros digitados é maior que 100";
        }
        else
        {
            t = "A soma dos dois numeros não é maior que 100";
        }
        return t;
    }

    public static void textofinal(String t2) {
        System.out.println(t2);
    }
}