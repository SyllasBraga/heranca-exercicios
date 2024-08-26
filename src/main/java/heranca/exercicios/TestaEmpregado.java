package heranca.exercicios;

import heranca.exercicios.models.Empregado;

public class TestaEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João Silva", "Rua das Flores, 123", "(33) 99101-0012",
                101, 3000.0, 0.15);

        System.out.println(empregado1);

        empregado1.setSalarioBase(3500.0);
        System.out.println("\nNovo Salário Base: " + empregado1.getSalarioBase());
        System.out.println("Novo Salário Líquido: " + empregado1.calcularSalario());
    }
}

