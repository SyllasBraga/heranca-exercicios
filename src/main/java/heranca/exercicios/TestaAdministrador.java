package heranca.exercicios;

import heranca.exercicios.models.Administrador;

public class TestaAdministrador {
    public static void main(String[] args) {
        Administrador administrador1 = new Administrador("Maria Souza", "Av. Central, 45", "(33) 99101-0012", 202, 5000.0, 0.2, 1000.0);

        System.out.println(administrador1);
        System.out.println("Salário Líquido: " + administrador1.calcularSalario());

        administrador1.setAjudaDeCusto(1500.0);
        System.out.println("\nNova Ajuda de Custo: " + administrador1.getAjudaDeCusto());
        System.out.println("Novo Salário Líquido: " + administrador1.calcularSalario());
    }
}

