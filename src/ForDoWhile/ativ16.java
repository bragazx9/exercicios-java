package ForDoWhile;

import java.util.Scanner;

public class ativ16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva algo:");
        String texto = scanner.nextLine();

        for(int i = 0; i < texto.length();i++){
            System.out.print(texto.charAt(i) + " ");
        }
        scanner.close();
    }

}
