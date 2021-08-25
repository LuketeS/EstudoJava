package exs_aula70.ex2;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	public double salarioLiquido;
	
	public double calcularSalarioLiquido(double salarioBruto, double imposto) {
		this.salarioLiquido = salarioBruto - imposto;			
		return this.salarioLiquido;
	}
	
	public double aumentarSalario(double aumento) {
		this.salarioBruto += (aumento * this.salarioBruto)/100;		
		return this.salarioBruto;			
	}
}
