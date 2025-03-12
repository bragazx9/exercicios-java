package SalarioFuncionario;

public class DadosFuncionario {
    private String nome;
    private double salarioBruto;
    private double imposto;
    private double aumento;


    public DadosFuncionario (){
        this.nome = String.valueOf(nome);
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        this.aumento = aumento;
    }

    public double SalarioLiquido(){
        return salarioBruto - imposto;
    }

    public double getaumento() {
        return salarioBruto * (1+(aumento/100));
    }

    public double getimposto() {
        return imposto;
    }

    public double getsalarioBruto(){
        return salarioBruto;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public String setNome(String nome) {
        this.nome = String.valueOf(nome);
        return nome;
    }
}