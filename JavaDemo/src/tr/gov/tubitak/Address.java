package tr.gov.tubitak;

public class Address {
	private String name;
	private int no;
	public City city = new City();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	

}
