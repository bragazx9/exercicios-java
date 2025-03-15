package Constutores;

class ContaBancaria {
    private String titular;
    private double saldo;
    private String tipoConta;

    // Construtor completo
    public ContaBancaria(String titular, double saldo, String tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(String titular) {
        this(titular, 0.0, "corrente");
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void exibirInfo() {
        System.out.println("titular: " + getTitular() + ", saldo: " + getSaldo() + ", tipo da Conta: " + getTipoConta());
    }
}

