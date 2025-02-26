class Pedido {
    private String codigo;
    private StatusPedido status;

    public Pedido(String codigo, StatusPedido status) {
        this.codigo = codigo;
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public StatusPedido getStatus() {
        return status;
    }
}
