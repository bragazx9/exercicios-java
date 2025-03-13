package gettersAndSetters;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bernardin");
        pessoa.setIdade(17);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        ContaBancaria conta = new ContaBancaria("FpBala", 10.000);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$" + conta.getSaldo());
        conta.depositar(500);
        conta.sacar(300);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        Produto produto = new Produto("COmputador", 1500, 10);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Estoque: " + produto.getEstoque() + " unidade");
        produto.adicionarEstoque(6);
        produto.removerEstoque(10);
        System.out.println("Estoque final: " + produto.getEstoque() + " unidade");
    }
}


