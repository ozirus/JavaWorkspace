package tr.gov.tubitak.dokuzeylul;

public class Pencere {
	private String type;
	//bu �ekilde new ile �a��rmay� engellemi� olduk, pencereden yeni bir obje olu�turmamak i�in private yapt�k constructoru
	private Pencere() {

	}
	public static Pencere getInstance(String type) {
		Pencere pencere = new Pencere();
		pencere.type = type;
		return pencere;
	}

	// Singleton uygulmas�

	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}

}
