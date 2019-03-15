package h5_opdr7;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		return p1.getLeeftijd() - p2.getLeeftijd();
	}

}
