package tr.gov.tubitak;

public class Run {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("�mer");
		member.setSurname("Y�ld�z");
		member.setAge(27);
		member.address.setName("Cengiz Topel cd.");
		member.address.setNo(25);
		member.address.city.setName("Gebze");
		member.setPhone("212-1341-2423");

		System.out.println(member.getName()
				+" " + member.getSurname()
				+ " "+ member.getAge()
				+" "+member.address.getName()
				+"no" + member.address.getNo()
				+" "+member.address.city.getName() );
		
	}

}
