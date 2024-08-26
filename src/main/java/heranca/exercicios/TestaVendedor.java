package heranca.exercicios;

import heranca.exercicios.models.Vendedor;

public class TestaVendedor {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Ana Lima", "Rua dos Limoeiros, 456", "(33) 99101-0012", 404, 2800.0, 0.12, 15000.0, 0.03);

        System.out.println(vendedor1);
        System.out.println("Salário Líquido: " + vendedor1.calcularSalario());

        vendedor1.setValorVendas(18000.0);
        System.out.println("\nNovo Valor de Vendas: " + vendedor1.getValorVendas());
        System.out.println("Novo Salário Líquido: " + vendedor1.calcularSalario());
    }
}

