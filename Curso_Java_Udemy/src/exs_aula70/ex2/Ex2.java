package exs_aula70.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Funcionario funcionario1 = new Funcionario();
		System.out.println("Name: ");
		funcionario1.nome = scan.nextLine();
		System.out.println("Gross salary: ");
		funcionario1.salarioBruto = scan.nextDouble();
		System.out.println("Tax: ");
		funcionario1.imposto = scan.nextDouble();
		funcionario1.calcularSalarioLiquido(funcionario1.salarioBruto, funcionario1.imposto);
		System.out.printf("Employee: "+funcionario1.nome+", $ %.2f",funcionario1.salarioLiquido);
		System.out.println("\n which percentage to increase salary? ");
		double aumento = scan.nextDouble();
		funcionario1.aumentarSalario(aumento);
		System.out.println("Novo Salario Bruto: "+funcionario1.salarioBruto);
		funcionario1.calcularSalarioLiquido(funcionario1.salarioBruto, funcionario1.imposto);
		System.out.printf("Updated data: "+ funcionario1.nome+", $ %.2f",funcionario1.salarioLiquido);
		scan.close();
		
	}
}
