package exs_aula70.ex1;

import java.util.Locale;
import java.util.Scanner;


public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Retangulo retangulo1 = new Retangulo();
		System.out.println("Enter rectangle width and height:");
		retangulo1.largura = scan.nextDouble();
		retangulo1.altura = scan.nextDouble();		
		retangulo1.calcularArea(retangulo1.largura,retangulo1.altura);
		System.out.println("AREA: "+retangulo1.area);
		
		scan.close();
	}
}