package HouseOfTheDragon;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Targaryen extends House {
	private int heatResistance;
	private int madness;
	public Targaryen() {
		this.setName("Targaryen");
		this.setSigil("Three Headed Dragon");
		this.setWords("Fire and Blood");
	}
	public Targaryen(int hR, int md){
		this();
		this.heatResistance = hR;
		this.madness = md;
	}
}
