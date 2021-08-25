package exsAula82;

import java.util.Locale;
import java.util.Scanner;

import exsAula82.entities.Conta;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter account number: ");
		Integer numero = scan.nextInt();
		System.out.println("Enter account holder: ");
		scan.nextLine();
		String titular = scan.nextLine();
		Conta conta1 = new Conta(numero,titular,0.0);
		System.out.println("Is ther an initial deposit (y/n)?");
		char resposta = scan.next().charAt(0);			
		if(resposta =='y') {
			System.out.println("Enter initial deposit value: ");
			Double depositoInicial = scan.nextDouble();
			conta1.depositarDinheiro(depositoInicial);
			
		}
		else if(resposta =='n') {
			
		}
		
		else {
			System.out.println("Opção inválida");
		}
		
		
		System.out.printf("\n Account data: "+"\n"+"Account "+conta1.getNumeroConta()+", Holder: "+conta1.getTitularConta()+", Balance: $ "+conta1.getSaldoConta());
		scan.close();
	}

}
