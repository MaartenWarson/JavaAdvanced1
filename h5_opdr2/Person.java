package h5_opdr2;

public class Person {
	private String voornaam;
	private String achternaam;
	private String geslacht;
	private int leeftijd;
	private int gewicht;
	private int lengte;
	
	public Person(String voornaam, String achternaam, String geslacht, int leeftijd, int gewicht, int lengte) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.geslacht = geslacht;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
	}
	
	@Override
	public String toString() {
		return voornaam + " " + achternaam;
	}

	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public String getGeslacht() {
		return geslacht;
	}
	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public int getLengte() {
		return lengte;
	}
	public void setLengte(int lengte) {
		this.lengte = lengte;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + leeftijd;
		result = prime * result + ((voornaam == null) ? 0 : voornaam.hashCode());
		result = prime * result + ((achternaam == null) ? 0 : achternaam.hashCode());
		result = prime * result + lengte;
		result = prime * result + gewicht;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (leeftijd != other.leeftijd)
			return false;
		if (voornaam == null) {
			if (other.voornaam != null)
				return false;
		} else if (!voornaam.equals(other.voornaam))
			return false;
		if (achternaam == null) {
			if (other.achternaam != null)
				return false;
		} else if (!achternaam.equals(other.achternaam))
			return false;
		if (lengte != other.lengte)
			return false;
		if (gewicht != other.gewicht)
			return false;
		return true;
	}
}
