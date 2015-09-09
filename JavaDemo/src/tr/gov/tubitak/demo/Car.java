package tr.gov.tubitak.demo;

public class Car {
	public String name;
	public String year;
	public Tyre tyre;
	public HeadLight headlight;

	public Car() {

	}

	public Car(String name, String year, String tyreBrand, int tyreDepth, String headLightType) {
		this.name = name;
		this.year = year;
		tyre = new Tyre(tyreBrand, tyreDepth);
		headlight = new HeadLight(headLightType);
	}

	public class Tyre {
		public String brand;
		public int depth;

		public Tyre(String brand, int depth) {
			this.brand = brand;
			this.depth = depth;

		}

		public Tyre() {

		}

	}

	public class HeadLight {
		public String type;

		public HeadLight(String type) {
			this.type = type;
		}

		public HeadLight() {

		}
	}

}
