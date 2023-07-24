package HouseOfTheDragon;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class House {
	@Id	
	private String name;
	private String sigil;
	private String words;
	
	public House() {}
}
