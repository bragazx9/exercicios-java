package gettersAndSetters;

public class Main {
    public static void main(String[] args) {
        // Teste da classe Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Teste da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria("Maria", 1000);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$" + conta.getSaldo());
        conta.depositar(500);
        conta.sacar(300);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Teste da classe Produto
        Produto produto = new Produto("Celular", 1500, 10);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Estoque: " + produto.getEstoque() + " unidades");
        produto.adicionarEstoque(5);
        produto.removerEstoque(8);
        System.out.println("Estoque final: " + produto.getEstoque() + " unidades");
    }
}


