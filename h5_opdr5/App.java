package h5_opdr5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		BurgerOrder order1 = new BurgerOrder("McGiant", 1);
		BurgerOrder order2 = new BurgerOrder("McChicken", 2);
		BurgerOrder order3 = new BurgerOrder("McFluffy", 3);
		BurgerOrder order4 = new BurgerOrder("McChilly", 4);
		BurgerOrder order5 = new BurgerOrder("McDontKnow", 5);

		// LINKEDLIST => volgorde zoals ze zijn toegevoegd
		Queue<BurgerOrder> orderList = new LinkedList<>();
		orderList.offer(order5);
		orderList.offer(order3);
		orderList.offer(order1);
		orderList.offer(order2);
		orderList.offer(order4);

		System.out.println("ORDER MET LINKEDLIST (inkomende volgorde)");
		orderList.forEach(System.out::println);

		// PRIORITYQUEUE => natuurlijke volgorde
		// ERROR OMDAT BURGERORDER-KLASSE NIET COMPARABLE IMPLEMENTEERT DENK IK
		Queue<BurgerOrder> orderList2 = new PriorityQueue<>();
		orderList2.offer(order5);
		orderList2.offer(order3);
		orderList2.offer(order1);
		orderList2.offer(order2);
		orderList2.offer(order4);
		
		System.out.println("ORDER MET PRIORITYQUEUE (natuurlijke volgorde)");
		orderList2.forEach(System.out::println);
	}
}
