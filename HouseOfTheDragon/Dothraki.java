package HouseOfTheDragon;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Dothraki extends Language {
	private int agression;
	private int horseCharm;
	
	public Dothraki() {
		this.setComplexity(70);
		this.setOrigin("The Great Grass Sea");
		this.setName("Dothraki");
	}
	@Override
	public int benefit() {
		return (agression + horseCharm) / 2;
	}
}
