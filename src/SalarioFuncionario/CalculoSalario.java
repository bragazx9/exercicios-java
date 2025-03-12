package SalarioFuncionario;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DadosFuncionario dados = new DadosFuncionario();


        System.out.println("Nome do funcionario: ");
        String nome = sc.nextLine();
        dados.setNome(nome);


        System.out.println("Salario bruto: ");
        double salarioBruto = sc.nextDouble();
        dados.setSalarioBruto(salarioBruto);

        System.out.println("Imposto: ");
        double imposto = sc.nextDouble();
        dados.setImposto(imposto);

        System.out.println("aumento: ");
        double aumento = sc.nextDouble();
        dados.setAumento(aumento);

        System.out.println("Nome: " + dados.setNome(nome));
        System.out.printf("Salario bruto: %.2f%n", dados.getsalarioBruto());
        System.out.printf("Imposto: %.2f%n", dados.getimposto());
        System.out.printf("Salario Liquido: %.2f%n", dados.SalarioLiquido());
        System.out.printf("Salario com aumento: %.2f%n",dados.getaumento());

    }
}