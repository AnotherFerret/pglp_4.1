package annuaire;

import java.time.LocalDate;
import java.util.HashSet;

enum Application {
	ENVIRONNEMENT;
	
	
	
	public static void main(String[] args) {

		LocalDate d = LocalDate.of(1975, 03, 19);
		HashSet<PhoneNumber> t = new HashSet<PhoneNumber>();
		t.add(new PhoneNumber("0123456789"));
		t.add(new PhoneNumber("9876543210"));
		
		
		Personnel p1 = new Personnel
					.Builder("name", "name2")
					.build();
		
		Personnel p2 = new Personnel
						.Builder("name3", "name4")
						.fonction("random task")
						.datenaissance(d)
						.telephone(t)
						.build();
		System.out.println(p1.ShowValues());
		System.out.println(p2.ShowValues());
	}					
			

}
