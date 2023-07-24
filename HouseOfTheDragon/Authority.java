package HouseOfTheDragon;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public abstract class Authority {
	@Id
	private String allegiance;
	@OneToMany
	private List<Monarch> titles = new ArrayList<Monarch>();
	abstract void notifyDeath(Human successor, String title);
}
