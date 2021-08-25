package exsAula82.entities;

public class Conta {

	private Integer numeroConta;
	private String titularConta;
	private Double saldoConta;
	
	public Conta(Integer numeroConta, String titularConta, Double saldoConta) {	
		this.numeroConta=numeroConta;
		this.titularConta=titularConta;
		this.saldoConta=saldoConta;
	}		
	
	public String getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public Double getSaldoConta() {
		return saldoConta;
	}
	
	public Double sacarDinheiro(Double valor) {		
		return this.saldoConta = this.saldoConta - 5 - valor;
	}
	
	public Double depositarDinheiro(Double valor) {
		return this.saldoConta = this.saldoConta + valor;
	}
		
	
}
