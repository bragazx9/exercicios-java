package herança4;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[2];


        pagamentos[0] = new PagamentoCartao("1234-5678-9012-3456", "0", "0");


        pagamentos[1] = new PagamentoDinheiro("0", "100", "0");


        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento();
        }
    }
}