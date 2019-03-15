package h1_opdr4;

/*DE KLASSE COMPARABLEDUO GAAT GEBRUIK MAKEN VAN EEN TYPE NAAR KEUZE (E).
 * DIT TYPE MOET DE INTERFACE COMPARABLE<E> IMPLEMENTEREN ZODAT DE VARIABELEN DIE
 * AANGEMAAKT WORDEN VERGELEKEN MET ELKAAR KUNNEN WORDEN DOOR GEBRUIK TE MAKEN 
 * VAN DE METHODE COMPARETO().
 * DAARNAAST IS COMPARABLEDUO EEN SUBKLASSE VAN SUPERKLASSE DUO.
 */
public class ComparableDuo<E extends Comparable<E>> extends Duo<E> {
	public ComparableDuo(E first, E second) {
		super(first, second);
	}
	
	public E getHighest() {
		return (getFirst().compareTo(getSecond()) < 0)?
				getSecond():getFirst();
	}
	
	public E getLowest() {
		return (getFirst().compareTo(getSecond()) <= 0)?
				getFirst():getSecond();
	}
}
