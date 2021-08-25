package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList <>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");	
		
		System.out.println(list.size());		
				
		for(String x : list) {//for each
			System.out.println(x);
		}
		System.out.println("-----------------------");
		//list.remove("Anna");
		//list.remove(1);
					
			
		list.removeIf(x -> x.charAt(0) == 'M');	//remove todo valor que comecar com M
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));//mostra posi��o do elemento
		
		
		//deixar na lista s� elementos come�ando com A		
		//-----------------------------------
		List<String> result = list.stream().filter(x->x.charAt(0) == 'A' ).collect(Collectors.toList());
		
		//primeiro converta pra stream, depois faz opera��o lambda(x->x...), depois converte pra lista dnv. 
		
		//-----------------------------------
		System.out.println("-----------------------");
		
		for(String x : result) {
			System.out.println(x);
		}
		
		
		System.out.println("-----------------------");
		
		//encontrar primeiro elemento com A e se n�o existir retorna nulo
		String name = list.stream().filter(x->x.charAt(0) == 'A' ).findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
