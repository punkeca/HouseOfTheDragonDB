package HouseOfTheDragon;

import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Valyrian extends Language{
	private int dragonCharm;
	private String variation;
	
	public Valyrian() {
		this.setComplexity(90);
		this.setOrigin("Valyria");
		this.setName("Valyrian");
	}
	@Override
	public int benefit() {
		return dragonCharm;
	}
}
