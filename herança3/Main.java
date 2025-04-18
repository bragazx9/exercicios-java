package herança3;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Fernanda", 3000);
        Gerente g = new Gerente("Vinicius", 5000, 1500);
        Desenvolvedor d = new Desenvolvedor("Andre", 4000);

        System.out.println("salário de Fernanda: R$ " + f.calcularSalario());
        System.out.println("salário de Vinicius (Gerente): R$ " + g.calcularSalario());
        System.out.println("salário de Andre (Desenvolvedor): R$ " + d.calcularSalario());
    }
}