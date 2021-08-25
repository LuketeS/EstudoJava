package aula115;

import java.util.Date;

import aula115.entities.Pedidos;
import aula115.entities.enums.OrderStatus;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pedidos pedidos = new Pedidos(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(pedidos);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2= OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
