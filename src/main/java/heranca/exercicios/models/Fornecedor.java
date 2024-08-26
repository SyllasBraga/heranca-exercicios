package heranca.exercicios.models;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {
        super();
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, double valorCredito) {
        super(nome);
        this.valorCredito = valorCredito;
        this.valorDivida = 0.0;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return STR."Fornecedor{nome='\{getNome()}\{'\''}, endereco='\{getEndereco()}\{'\''}, telefone='\{getTelefone()}\{'\''}, valorCredito=\{valorCredito}, valorDivida=\{valorDivida}\{'}'}";
    }
}

