package Constutores;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = (preco < 0) ? 0.0 : preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInfo() {
        System.out.println("produto: " + getNome() + ", Preço: " + getPreco());
    }
}
