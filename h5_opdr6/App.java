package h5_opdr6;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {

	public static void main(String[] args) {
		Deque<String> personen = new ArrayDeque<>();
		personen.offer("Maarten");
		personen.offer("Thibaut");
		personen.offer("Jan");
		personen.offer("Jolein");
		personen.offer("Katrien");
		personen.offer("Chelsea");
		
		personen.forEach(System.out::println);
		
		String koppel1 = personen.peekFirst() + " & " + personen.peekLast();
		personen.pollFirst();
		personen.pollLast();
		String koppel2 = personen.peekFirst() + " & " + personen.peekLast();
		personen.pollFirst();
		personen.pollLast();		
		String koppel3 = personen.peekFirst() + " & " + personen.peekLast();
		personen.pollFirst();
		personen.pollLast();
		
		System.out.println(koppel1);
		System.out.println(koppel2);
		System.out.println(koppel3);
	}
}
