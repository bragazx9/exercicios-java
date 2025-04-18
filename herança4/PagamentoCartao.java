package herança4;

public class PagamentoCartao extends Pagamento{
    public PagamentoCartao(String cartao, String dinheiro, String pix) {
        super(cartao, dinheiro, pix);
    }

    @Override
    public double realizarPagamento() {
        System.out.println("Pagamento aprovado com cartão");
        return 1;
    }
}