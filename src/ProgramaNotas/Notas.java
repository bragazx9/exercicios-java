package ProgramaNotas;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student notas = new Student();

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        notas.setNome(nome);

        System.out.println("Digite sua primeira nota:");
        int nota1 = sc.nextInt();
        notas.setNota1(nota1);

        System.out.println("Digite sua primeira nota:");
        int nota2 = sc.nextInt();
        notas.setNota2(nota2);

        System.out.println("Digite sua primeira nota:");
        int nota3 = sc.nextInt();
        notas.setNota3(nota3);

        System.out.println(notas);

        sc.close();



    }
}
