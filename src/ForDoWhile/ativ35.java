package ForDoWhile;

import java.util.Scanner;

public class ativ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("digite um número");
        int num = sc.nextInt();

        do{
            System.out.println(num + " x " + i + " = " + num*i);
            i++;
        }while(i <=10);
        sc.close();
    }
}
