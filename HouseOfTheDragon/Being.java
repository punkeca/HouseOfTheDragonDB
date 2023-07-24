package HouseOfTheDragon;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public abstract class Being {
	@OneToOne
	private House house;
	@Id
	private String name;
	private String birthdate;
	
	public Being() {
		
	}

	public Being(House h) {
		this.house = h;
	}
	
	public abstract void baptize(String n, House h);
}
