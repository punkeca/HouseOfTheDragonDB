package HouseOfTheDragon;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public abstract class Monarch {
	@OneToOne
	protected Human seated;
	@Id
	private String name;
	public abstract boolean succession( Human successor, String title);
}
