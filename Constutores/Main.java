package Constutores;

public class Main {
    public static void main(String[] args) {
    
        Carro carro = new Carro("toyota", 2022);
        carro.exibirInfo();

        Pessoa pessoa1 = new Pessoa("Arthuzin", 22);
        Pessoa pessoa2 = new Pessoa();
        pessoa1.exibirInfo();
        pessoa2.exibirInfo();

        ContaBancaria conta1 = new ContaBancaria("Carlin", 1500.0, "poupança");
        ContaBancaria conta2 = new ContaBancaria("Fredao");
        conta1.exibirInfo();
        conta2.exibirInfo();

        Produto produto1 = new Produto("notebook", 3000.0);
        Produto produto2 = new Produto("celular", -500.0);
        produto1.exibirInfo();
        produto2.exibirInfo();
    }
}
