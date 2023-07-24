package HouseOfTheDragon;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Velaryon extends House {
	private int fleetSize;
	private int seaSkill;
	
	public Velaryon() {
		this.setName("Velaryon");
		this.setSigil("Seahorse");
		this.setWords("The Old, the True, the Brave");
	}
	
	public Velaryon(int fs, int sk) {
		this();
		this.fleetSize = fs;
		this.seaSkill = sk;
	}
	
}
