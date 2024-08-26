package heranca.exercicios;

import heranca.exercicios.models.Fornecedor;

public class TestaFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("Sorveteria da Josi", "Rua Principal, 123", "(33) 99101-0012",
                5000.0, 1500.0);

        System.out.println(fornecedor1);

        fornecedor1.setValorDivida(2000.0);
        System.out.println("Nova Dívida: " + fornecedor1.getValorDivida());
        System.out.println("Novo Saldo: " + fornecedor1.obterSaldo());

        Fornecedor fornecedor2 = new Fornecedor("Empresa ABC", 10000.0);
        fornecedor2.setEndereco("Avenida Secundária, 456");

        System.out.println(fornecedor2);
    }
}