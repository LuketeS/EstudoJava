package exs_aula96;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de funcionários");
		int N = scan.nextInt();		
		scan.nextLine();
		List <String> list = new ArrayList<>();
		for (int i=0;i<N;i++) {
			System.out.println("Digite o nome do "+ i +"o funcionário");			
			String name = scan.nextLine();
			list.add(name);
			
		}
		for(String x : list) {	
			System.out.println("Nomes da lista:");
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
