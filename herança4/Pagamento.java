package herança4;

public class Pagamento {
    private String cartao;
    private String dinheiro;
    private String pix;

    public Pagamento(String cartao, String dinheiro, String pix) {
        this.cartao = cartao;
        this.dinheiro = dinheiro;
        this.pix = pix;
    }

    public double realizarPagamento() {
        System.out.println("Processando pagamento...");
        return 0;
    }

    public double pagamentoDinheiro() {
        System.out.println("Processando pagamento em dinheiro...");
        return 0;
    }
}