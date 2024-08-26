package heranca.exercicios;

import heranca.exercicios.models.Operario;

public class TestaOperario {
    public static void main(String[] args) {
        Operario operario1 = new Operario("Carlos Pereira", "Rua Nova, 789", "(33) 99101-0012", 303, 2500.0, 0.1, 20000.0, 0.05);

        System.out.println(operario1);
        System.out.println("Salário Líquido: " + operario1.calcularSalario());

        operario1.setValorProducao(25000.0);
        System.out.println("\nNovo Valor de Produção: " + operario1.getValorProducao());
        System.out.println("Novo Salário Líquido: " + operario1.calcularSalario());
    }
}

