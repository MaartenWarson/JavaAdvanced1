package h2_opdr4;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class Drawing implements Iterable{
	public class DrawableIterator implements Iterator {

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public Object next() {
			return null;
		}
	}

	@Override
	public Iterator iterator() {
		DrawableIterator drawIterator = new DrawableIterator();
		return drawIterator;
	}
}

/*Implemenatie van het hoofprogramma niet gedaan omdat dit veel werk is
 * om alle verschillende figuren te maken en dit niet relevant is voor
 * de kennis van dit hoofdstuk.*/
